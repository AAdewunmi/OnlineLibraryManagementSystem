package com.librarymanagementsystem.students;

import com.librarymanagementsystem.transactions.Search;
import com.librarymanagementsystem.transactions.UserTransactions;

/**
 * @author Adrian Adewunmi
 * @date 06/01/2020
 * This class is used to create a student object
 */
public class Student extends UserTransactions implements Search {

    private final String name;
    private final String studentId;
    private final String email;

    /**
     * This is the constructor for the student class
     * @param name
     * @param studentId
     * @param email
     */

    public Student(String name, String studentId, String email) {
        this.name = name;
        this.studentId = studentId;
        this.email = email;
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

    @Override
    public String toString() {
        return "Student Name: " + name + "\n"
                + "Student ID: " + studentId + "\n"
                + "Email: " + email + "\n";
    }

}
