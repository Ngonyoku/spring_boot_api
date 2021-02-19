package com.ngonyoku.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.AUGUST;
import static java.time.Month.NOVEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student roderick = new Student(
                    "Ngonyoku Roderick",
                    21,
                    LocalDate.of(2000, NOVEMBER, 20),
                    "ngonyoku@example.com"
            );

            Student cate = new Student(
                    "Cate Wanjiru",
                    21,
                    LocalDate.of(1985, AUGUST, 4),
                    "cate@example.com"
            );

            studentRepository.saveAll(
                    List.of(roderick, cate)
            );
        };
    }
}
