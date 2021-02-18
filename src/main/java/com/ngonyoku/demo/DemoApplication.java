package com.ngonyoku.demo;

import com.ngonyoku.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

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
