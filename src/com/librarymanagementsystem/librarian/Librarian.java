package com.librarymanagementsystem.librarian;

import com.librarymanagementsystem.transactions.Search;
import com.librarymanagementsystem.transactions.UserTransactions;

/**
 * @author Adrian Adewunmi
 * @date 24/01/2022
 * This class is used to create a librarian object
 */
public class Librarian extends UserTransactions {
    private final String librarianName;
    private final String librarianIDNumber;
    private final String librarianEmail;
    private final String librarianUserName;
    private String librarianPassword;

    /**
     * This is a constructor for the librarian class
     * @param librarianName
     * @param librarianIDNumber
     * @param librarianEmail
     */
    public Librarian(String librarianName, String librarianIDNumber, String librarianEmail, String librarianUserName, String librarianPassword) {
        this.librarianName = librarianName;
        this.librarianIDNumber = librarianIDNumber;
        this.librarianEmail = librarianEmail;
        this.librarianUserName = librarianUserName;
        this.librarianPassword = librarianPassword;
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

    public String getLibrarianUserName() {
        return librarianUserName;
    }

    public String getLibrarianPassword() {
        return librarianPassword;
    }

    public void setLibrarianPassword(String librarianPassword) {
        this.librarianPassword = librarianPassword;
    }

    @Override
    public String toString() {
        return "Librarian Name: " + librarianName + "\n" +
                "Librarian ID Number: " + librarianIDNumber + "\n" +
                "Librarian Email: " + librarianEmail + "\n";
    }
}
