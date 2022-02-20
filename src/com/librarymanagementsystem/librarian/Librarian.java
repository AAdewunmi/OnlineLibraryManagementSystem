package com.librarymanagementsystem.librarian;

import com.librarymanagementsystem.books.Book;
import com.librarymanagementsystem.books.BookCatalogue;
import com.librarymanagementsystem.books.BookList;
import com.librarymanagementsystem.books.BookShelf;

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

    // Add A Book To The Catalogue
    public void addBookToCatalogue(String ISBN, String author, String bookTitle,
                                  int numberOfBookCopies, String bookCategory, String shelfName) {
        Book book = new Book(ISBN, author, bookTitle, numberOfBookCopies);
        BookList bookList = new BookList();
        bookList.addBook(book);
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBookList(bookCategory, bookList);
        BookCatalogue bookCatalogue = new BookCatalogue();
        bookCatalogue.addBookShelf(shelfName, bookShelf);
        //bookCatalogue.printAllBooks();
    }

    // Print All Books In The Catalogue
    public void printAllBooksInCatalogue() {
        BookCatalogue bookCatalogue = new BookCatalogue();
        bookCatalogue.printAllBooks();
    }

    /*// Print All Books In A Specific Shelf
    public void printAllBooksInAShelf(String shelfName) {
        BookCatalogue bookCatalogue = new BookCatalogue();
        bookCatalogue.printAllBooksInAShelf(shelfName);
    }

    // Print All Books In A Specific Shelf
    public void printAllBooksInAShelf(String shelfName, String bookCategory) {
        BookCatalogue bookCatalogue = new BookCatalogue();
        bookCatalogue.printAllBooksInAShelf(shelfName, bookCategory);
    }

    // Print All Books In A Specific Shelf
    public void printAllBooksInAShelf(String shelfName, String bookCategory, String bookTitle) {
        BookCatalogue bookCatalogue = new BookCatalogue();
        bookCatalogue.printAllBooksInAShelf(shelfName, bookCategory, bookTitle);
    }

    // Print All Books In A Specific Shelf
    public void printAllBooksInAShelf(String shelfName, String bookCategory, String bookTitle, String author) {
        BookCatalogue bookCatalogue = new BookCatalogue();
        bookCatalogue.printAllBooksInAShelf(shelfName, bookCategory, bookTitle, author);
    }

    // Print All Books In A Specific Shelf
    public void printAllBooksInAShelf(String shelfName, String bookCategory, String bookTitle, String author, String ISBN) {
        BookCatalogue bookCatalogue = new BookCatalogue();
        bookCatalogue.printAllBooksInAShelf(shelfName, bookCategory, bookTitle, author, ISBN);
    }

    // Print All Books In A Specific Shelf
    public void printAllBooksInAShelf(String shelfName, String bookCategory, String bookTitle, String author, String ISBN, int numberOfBookCopies) {
        BookCatalogue bookCatalogue = new BookCatalogue();
        bookCatalogue.printAllBooksInAShelf(shelfName, bookCategory, bookTitle, author, ISBN, numberOfBookCopies);
    }

    // Print All Books*/

    // Search Catalogue For A Book
    public void searchCatalogue() {
        System.out.println("Searching for a book...");
    }

    // Remove A Book From The Catalogue
    public void removeBookFromCatalogue() {
        System.out.println("Removing a book from the catalogue...");
    }

    @Override
    public String toString() {
        return "Librarian Name: " + librarianName + "\n" +
                "Librarian ID Number: " + librarianIDNumber + "\n" +
                "Librarian Email: " + librarianEmail + "\n";
    }
}
