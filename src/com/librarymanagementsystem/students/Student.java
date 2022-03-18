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

    /**
     * This method is used to give the student access to the
     * list of books, created by a librarian.
     * @param list: book object
     */
    public void getAllBooksFromUserTransactions(ArrayList<Book> list){
        this.listOfBooks = (ArrayList<Book>) list.clone();
    }

    /**
     * This method is used to search for a book by ISBN.
     * @param isbn: book ISBN
     * @return book object
     */
    public boolean findBookByISBNFromStudentAccount(int isbn) {
        for (Book book : listOfBooks) {
            if (book.getISBN() == isbn) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method is used to print result from a search for a book by ISBN.
     * @param isbn: book ISBN
     */
    public void printABookFromStudentAccount(int isbn) {
        for (Book book : listOfBooks) {
            if (book.getISBN() == isbn) {
                System.out.println(book);
            }
        }
    }

    /**
     * This method is used to search for a book by title.
     * @param title: book title
     * @return book object
     */

    public boolean findBookByTitleFromStudentAccount(String title) {
        for (Book book : listOfBooks) {
            if (book.getBookTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method is used to print result from a search for a book by title.
     * @param title: book title
     */
    public void printABookFromStudentAccount(String title) {
        for (Book book : listOfBooks) {
            if (book.getBookTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
            }
        }
    }
}
