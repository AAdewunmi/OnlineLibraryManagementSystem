package com.librarymanagementsystem.students;

/**
 * @author Adrian Adewunmi
 * @date 06/01/2020
 * This class is used to create a student object
 */
public class Student {
    private final String studentId;
    private final String name;
    private final String email;

    public Student(String studentId, String name, String email) {
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
