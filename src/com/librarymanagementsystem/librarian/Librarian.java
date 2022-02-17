package com.librarymanagementsystem.librarian;

import com.librarymanagementsystem.books.Book;
import com.librarymanagementsystem.books.BookList;

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

    // Search Catalogue For A Book
    public void searchCatalogue() {
        System.out.println("Searching for a book...");
    }

    // Create A New Book
    public Book createNewBook(String ISBN, String author, String bookTitle, int numberOfBookCopies) {
        System.out.println("Creating a new book...");
        Book book = new Book(ISBN, author, bookTitle, numberOfBookCopies);
        System.out.println(book.toString());
        return book;
    }

    // Create A List Of Books
    public void createListOfBooks() {
        System.out.println("Creating a list of books...");
        BookList bookList = new BookList();

    }

    // Add A Book To The Catalogue
    public void addBookToCatalogue() {
        System.out.println("Adding a book to the catalogue...");

    }

    // Remove A Book From The Catalogue
    public void removeBookFromCatalogue() {
        System.out.println("Removing a book from the catalogue...");
    }
}
