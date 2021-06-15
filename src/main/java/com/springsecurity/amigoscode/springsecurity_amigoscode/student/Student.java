package com.springsecurity.amigoscode.springsecurity_amigoscode.student;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Student {

    private Integer studentId;
    private String studentName;
    private String gender;

    public Student(Integer studentId, String studentName, String gender) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
