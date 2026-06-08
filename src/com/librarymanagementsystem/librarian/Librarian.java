package com.librarymanagementsystem.librarian;

import com.librarymanagementsystem.transactions.UserTransactions;

/**
 * @author Adrian Adewunmi
 * @date 24/01/2022
 * Represents a librarian account that can manage library book transactions.
 */
public class Librarian extends UserTransactions {
    private final String librarianName;
    private final int librarianIDNumber;
    private final String librarianEmail;
    private final String librarianUserName;
    private final String librarianPassword;

    /**
     * Creates a librarian profile with login details.
     *
     * @param librarianName the name of the librarian
     * @param librarianIDNumber the id number of the librarian
     * @param librarianEmail the email address of the librarian
     * @param librarianUserName the login username for the librarian
     * @param librarianPassword the login password for the librarian
     */
    public Librarian(String librarianName, int librarianIDNumber, String librarianEmail, String librarianUserName, String librarianPassword) {
        this.librarianName = librarianName;
        this.librarianIDNumber = librarianIDNumber;
        this.librarianEmail = librarianEmail;
        this.librarianUserName = librarianUserName;
        this.librarianPassword = librarianPassword;
    }
    /**
     * Gets the librarian name.
     *
     * @return the librarian name
     */
    public String getLibrarianName() {
        return librarianName;
    }
    /**
     * Gets the librarian id number.
     *
     * @return the librarian id number
     */
    public int getLibrarianIDNumber() {
        return librarianIDNumber;
    }
    /**
     * Gets the librarian email address.
     *
     * @return the librarian email address
     */
    public String getLibrarianEmail() {
        return librarianEmail;
    }
    /**
     * Gets the librarian login username.
     *
     * @return the librarian username
     */
    public String getLibrarianUserName() {
        return librarianUserName;
    }
    /**
     * Gets the librarian login password.
     *
     * @return the librarian password
     */
    public String getLibrarianPassword() {
        return librarianPassword;
    }

    /**
     * Formats the librarian details for console output.
     *
     * @return the librarian name, id number, and email address
     */
    @Override
    public String toString() {
        return "Librarian Name: " + librarianName + "\n" +
                "Librarian ID Number: " + librarianIDNumber + "\n" +
                "Librarian Email: " + librarianEmail + "\n";
    }

}
