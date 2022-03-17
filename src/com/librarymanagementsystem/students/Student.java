package com.librarymanagementsystem.students;

import com.librarymanagementsystem.book.Book;
import com.librarymanagementsystem.transactions.UserTransactions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adrian Adewunmi
 * @date 06/01/2020
 * This class is used to create a student object
 */
public class Student extends UserTransactions {

    private final String name;
    private final int studentId;
    private final String email;
    private final String studentUsername;
    private final String studentPassword;
    private List<Book> listOfBooks;


    /**
     * This is the constructor for the student class
     * @param name: student name
     * @param studentId: student id
     * @param email: student email
     */

    public Student(String name, int studentId, String email,
                   String studentUsername, String studentPassword) {
        this.name = name;
        this.studentId = studentId;
        this.email = email;
        this.studentUsername = studentUsername;
        this.studentPassword = studentPassword;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
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

    @Override
    public String toString() {
        return "Student Name: " + name + "\n"
                + "Student ID: " + studentId + "\n"
                + "Email: " + email + "\n";
    }

    public void getAllBooksFromUserTransactions(ArrayList<Book> list){
        this.listOfBooks = (ArrayList<Book>) list.clone();
    }

    public boolean findBookByISBNFromStudentAccount(int isbn) {
        for (Book book : listOfBooks) {
            if (book.getISBN() == isbn) {
                return true;
            }
        }
        return false;
    }

    public void printABookFromStudentAccount(int isbn) {
        for (Book book : listOfBooks) {
            if (book.getISBN() == isbn) {
                System.out.println(book);
            }
        }
    }
}
