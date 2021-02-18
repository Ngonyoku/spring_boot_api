package com.ngonyoku.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//This is the API Layer
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
}
