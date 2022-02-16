package com.librarymanagementsystem.librarian;

import com.librarymanagementsystem.books.Book;

/**
 * @author Adrian Adewunmi
 * @date 24/01/2022
 * This class is used to create a librarian object
 */
public class Librarian {
    private String librarianName;
    private String librarianIDNumber;
    private String librarianEmail;

    /**
     * This is a constructor for the librarian class
     * @param librarianName
     * @param librarianIDNumber
     * @param librarianEmail
     */
    public Librarian(String librarianName, String librarianIDNumber, String librarianEmail) {
        this.librarianName = librarianName;
        this.librarianIDNumber = librarianIDNumber;
        this.librarianEmail = librarianEmail;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public String getLibrarianIDNumber() {
        return librarianIDNumber;
    }

    public String getLibrarianEmail() {
        return librarianEmail;
    }

    // TODO:
    // Create a new book (Programming Books)
    // Create a new book (Software Engineering Books)
    // Add book to list of programming books
    // Add book to list of software engineering books
    // Add list of programming books to bookshelf
    // Add list of software engineering to bookshelf
    // Add bookshelf to catalogue
    // Shelf 1
    // Shelf 2
    // Search for book!
}
