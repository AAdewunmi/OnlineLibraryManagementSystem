package com.librarymanagementsystem.librarian;

import com.librarymanagementsystem.book.Book;
import com.librarymanagementsystem.transactions.Search;
import com.librarymanagementsystem.transactions.UserTransactions;
import javafx.css.StyleableStringProperty;

/**
 * @author Adrian Adewunmi
 * @date 24/01/2022
 * This class is used to create a librarian object
 */
public class Librarian extends UserTransactions {
    private final String librarianName;
    private final int librarianIDNumber;
    private final String librarianEmail;
    private final String librarianUserName;
    private final String librarianPassword;

    /**
     * This is a constructor for the librarian class
     * @param librarianName
     * @param librarianIDNumber
     * @param librarianEmail
     */
    public Librarian(String librarianName, int librarianIDNumber, String librarianEmail, String librarianUserName, String librarianPassword) {
        this.librarianName = librarianName;
        this.librarianIDNumber = librarianIDNumber;
        this.librarianEmail = librarianEmail;
        this.librarianUserName = librarianUserName;
        this.librarianPassword = librarianPassword;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public int getLibrarianIDNumber() {
        return librarianIDNumber;
    }

    public String getLibrarianEmail() {
        return librarianEmail;
    }

    public String getLibrarianUserName() {
        return librarianUserName;
    }

    public String getLibrarianPassword() {
        return librarianPassword;
    }

    // Add book to the library
    public void addBook(String ISBN, String name, String title) {
        System.out.println("Add book to the library ... ");
        addBook(new Book(ISBN, name, title));
    }

    // Print the list of books
    public void printBookList() {
        System.out.println("Print the list of books ... ");
        printAllBooks();
    }

    @Override
    public String toString() {
        return "Librarian Name: " + librarianName + "\n" +
                "Librarian ID Number: " + librarianIDNumber + "\n" +
                "Librarian Email: " + librarianEmail + "\n";
    }
}
