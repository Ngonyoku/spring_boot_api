package com.ngonyoku.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//This is the Business Layer
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
