package com.ngonyoku.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//This interface is what will interact with our database
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
