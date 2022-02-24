package com.librarymanagementsystem.books;

import com.librarymanagementsystem.transactions.BookTransactions;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

/**
 * @author Adrian Adewunmi
 * @date 06/01/2022
 * This class is used to create a book object
 */

public class Book extends BookTransactions {
    private final String ISBN;
    private final String author;
    private final String bookTitle;

    /**
     * This is the constructor for the Book class
     * @param ISBN
     * @param author
     * @param bookTitle
     */
    public Book(String ISBN, String author, String bookTitle) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String toString(){
        return "\nISBN: " + this.ISBN + "\n"
                + "Author: " + this.author + "\n"
                + "Book Title: " + this.bookTitle + "\n";
    }

}
