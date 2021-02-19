package com.ngonyoku.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

//This is the Business Layer
@Service //This annotates that this is a service class and is available for dependecy injection
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());

        if (studentByEmail.isPresent()) {
            throw new IllegalStateException("Email address provided is not available"); //Throw an exception if the Student exists
        } else {
            studentRepository.save(student);
        }

        System.out.println(student);
    }

    //Delete the Student By Id
    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if (!exists) {
            throw new IllegalStateException("Student with id " + studentId + " does NOT EXIST");
        }

        studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(Long studentId, String name, String email) {
        Student student = studentRepository
                .findById(studentId)
                .orElseThrow(() ->
                        new IllegalStateException("Student with Id " + studentId + " Does not Exist")
                );

        if (name != null && name.length() > 0 && !student.getName().equals(name)) {
            student.setName(name);
        }
        if (email != null && email.length() > 0 && !student.getEmail().equals(email)) {
            if (studentRepository.findStudentByEmail(email).isPresent())//Ensure that that email does not exist
                throw new IllegalStateException("Email is Not available");
            else student.setEmail(email);
        }
    }
}
