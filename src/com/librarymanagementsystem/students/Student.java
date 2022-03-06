package com.librarymanagementsystem.students;

import com.librarymanagementsystem.transactions.Search;
import com.librarymanagementsystem.transactions.UserTransactions;

/**
 * @author Adrian Adewunmi
 * @date 06/01/2020
 * This class is used to create a student object
 */
public class Student extends UserTransactions {

    private final String name;
    private final String studentId;
    private final String email;
    private final String studentUsername;
    private String studentPassword;

    /**
     * This is the constructor for the student class
     * @param name
     * @param studentId
     * @param email
     */

    public Student(String name, String studentId, String email, String studentUsername, String studentPassword) {
        this.name = name;
        this.studentId = studentId;
        this.email = email;
        this.studentUsername = "student";
        this.studentPassword = "student";
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getEmail() {
        return email;
    }

    public String getStudentUsername() {
        return studentUsername;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    @Override
    public String toString() {
        return "Student Name: " + name + "\n"
                + "Student ID: " + studentId + "\n"
                + "Email: " + email + "\n";
    }

}
