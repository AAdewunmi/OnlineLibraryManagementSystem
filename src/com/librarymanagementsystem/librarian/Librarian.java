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

    // Search Catalogue For A Book
    public void searchCatalogue() {
        System.out.println("Searching for a book...");
    }

    // Add A Book To The Catalogue
    public void addBookToCatalogue(String ISBN, String author, String bookTitle,
                                  int numberOfBookCopies, String bookCategory, String shelfName) {
        System.out.println("Adding a book to the catalogue...");
        // Create A Book
        Book book = new Book(ISBN, author, bookTitle, numberOfBookCopies);
        // Create A BookList Of Books
        BookList bookList = new BookList();
        bookList.addBook(book);
        // Create A Category Of Books
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBookList(bookCategory, bookList);
        // Create A Shelf Of Books
        BookCatalogue bookCatalogue = new BookCatalogue();
        bookCatalogue.addBookShelf(shelfName, bookShelf);
        bookCatalogue.printAllBooks();
    }

    // Remove A Book From The Catalogue
    public void removeBookFromCatalogue() {
        System.out.println("Removing a book from the catalogue...");
    }
}
