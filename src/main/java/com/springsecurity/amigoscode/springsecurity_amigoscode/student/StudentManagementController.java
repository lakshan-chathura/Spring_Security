package com.springsecurity.amigoscode.springsecurity_amigoscode.student;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {
    private static final List<Student> studentList= Arrays.asList(
            new Student(1,"lakshan chathura","MALE"),
            new Student(2,"piumi gamage","FEMALE"),
            new Student(3,"sadali upeka","FEMALE")

    );

    @GetMapping("/getAllUsers")
    public List<Student> getAllStudents(){
       return studentList;
    }

    @PostMapping("/saveUser")
    public void registerStudent(@RequestBody Student student){
        System.out.println("Successfully saved student!!");
    }

    @PutMapping("/{studentId}")
    public void updateStudent(@PathVariable("studentId") Integer studentId,@RequestBody Student student){
        System.out.println("Student updated !!");
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId){
        System.out.println("Student deleted !!");
    }
}
