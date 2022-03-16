package com.librarymanagementsystem.librarian;

import com.librarymanagementsystem.book.Book;
import com.librarymanagementsystem.transactions.UserTransactions;

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
    /**
     * This method is used to get the librarian name
     * @return
     */
    public String getLibrarianName() {
        return librarianName;
    }
    /**
     * This method is used to get the librarian id number
     * @return
     */
    public int getLibrarianIDNumber() {
        return librarianIDNumber;
    }
    /**
     * This method is used to get the librarian email
     * @return
     */
    public String getLibrarianEmail() {
        return librarianEmail;
    }
    /**
     * This method is used to get the librarian user name
     * @return
     */
    public String getLibrarianUserName() {
        return librarianUserName;
    }
    /**
     * This method is used to get the librarian password
     * @return
     */
    public String getLibrarianPassword() {
        return librarianPassword;
    }

    /**
     * This method is used to add a book to the library
     * @param ISBN: isbn number of the book
     *              title: title of the book
     *            name: name of the author
     */
    /*public void addBook(int ISBN, String name, String title) {
        System.out.println("Add book to the library ... ");
        addBook(new Book(ISBN, name, title));
    }*/

    /**
     * This method is used to print all the books in the library
     */
    /*public void printBookList() {
        System.out.println("Print the list of books ... ");
        printAllBooks();
    }*/
    /**
     * This method is used to print library details
     */
    @Override
    public String toString() {
        return "Librarian Name: " + librarianName + "\n" +
                "Librarian ID Number: " + librarianIDNumber + "\n" +
                "Librarian Email: " + librarianEmail + "\n";
    }

}
