package com.librarymanagementsystem.books;

import java.io.PrintStream;

/**
 * @author Adrian Adewunmi
 * @date 06/01/2022
 * This class is used to create a book object
 */
public class Book {
    private final String ISBN;
    private final String author;
    private final String bookTitle;
    private int numberOfBookCopies;

    public Book(String ISBN, String author, String bookTitle, int numberOfBookCopies) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.ISBN = ISBN;
        this.numberOfBookCopies = numberOfBookCopies;
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

    // Gets the number of book copies
    public int getNumberOfBookCopies() {
        return numberOfBookCopies;
    }

    public String toString(){
        return "\nISBN: " + this.ISBN + "\n"
                + "Author: " + this.author + "\n"
                + "Book Title: " + this.bookTitle + "\n"
                + "Number of Book Copies: " + this.numberOfBookCopies + "\n";
    }

}
