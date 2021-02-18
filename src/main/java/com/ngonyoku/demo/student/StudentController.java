package com.ngonyoku.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")//Define the End Point
public class StudentController {

    @GetMapping
    public List<Student> hello() {
        return List.of(
                new Student(
                        1L,
                        "Roderick Ngonyoku",
                        20,
                        LocalDate.of(2001, Month.MARCH, 24),
                        "ngonyoku@example.com"
                )
        );
    }
}
