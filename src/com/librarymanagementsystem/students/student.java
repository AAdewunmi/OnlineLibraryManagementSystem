package com.librarymanagementsystem.students;

public class student {
    private final String studentId;
    private final String name;
    private final String email;

    public student(String studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
