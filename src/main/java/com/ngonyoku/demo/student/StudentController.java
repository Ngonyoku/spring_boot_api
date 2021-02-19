package com.ngonyoku.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//This is the API Layer - This is what Interacts wih the Client
@RestController
@RequestMapping(path = "api/v1/student")//Define the End Point
public class StudentController {

    private final StudentService studentService;

    @Autowired//This annotation states that the above studentService should be instanciated in the constructor
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //Returns all the Students from the Student Service class/Business layer
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    //Carry out the Post Requests
    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        //The request body will be taken and mapped onto the student object as passed in the parameter 
        studentService.addNewStudent(student);
    }

    //Deletes a Student based on the ID
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Long studentId,
                              @RequestParam(required = false) String name,
                              @RequestParam(required = false) String email) {
        studentService.updateStudent(studentId, name, email);

    }
}
