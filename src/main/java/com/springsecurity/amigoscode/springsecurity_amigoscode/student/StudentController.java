package com.springsecurity.amigoscode.springsecurity_amigoscode.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    private static final List<Student> studentList= Arrays.asList(
            new Student(1,"lakshan chathura","MALE"),
            new Student(2,"kusal janith","MALE"),
            new Student(3,"kusal mendis","MALE")

    );

    @GetMapping(path = "{studentId}")
    public Student getStudents(@PathVariable("studentId") Integer studentId){
        return studentList.stream()
                .filter(student -> studentId.equals(student.getStudentId()))
                .findFirst()
                .orElseThrow(()->new IllegalStateException("Student can't exsists!!!"));
    }
}
