package com.librarymanagementsystem.librarian;

import com.librarymanagementsystem.books.Book;
import com.librarymanagementsystem.transactions.Search;
import com.librarymanagementsystem.transactions.UserTransactions;

import java.util.List;

/**
 * @author Adrian Adewunmi
 * @date 24/01/2022
 * This class is used to create a librarian object
 */
public class Librarian extends UserTransactions implements Search {
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

    @Override
    public String toString() {
        return "Librarian Name: " + librarianName + "\n" +
                "Librarian ID Number: " + librarianIDNumber + "\n" +
                "Librarian Email: " + librarianEmail + "\n";
    }
}
