package com.ngonyoku.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//This is the Business Layer
@Service //This annotates that this is a service class and is available for dependecy injection
public class StudentService {

    public List<Student> getStudents() {
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
