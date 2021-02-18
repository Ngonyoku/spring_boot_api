package com.ngonyoku.demo.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private Integer age;
    private LocalDate db;
    private String email;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", db=" + db +
                ", email='" + email + '\'' +
                '}';
    }

    public Student(String name, Integer age, LocalDate db, String email) {
        this.name = name;
        this.age = age;
        this.db = db;
        this.email = email;
    }

    public Student(Long id, String name, Integer age, LocalDate db, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.db = db;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDb() {
        return db;
    }

    public void setDb(LocalDate db) {
        this.db = db;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
