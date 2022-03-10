package com.librarymanagementsystem.book;

import com.librarymanagementsystem.transactions.BookTransactions;

/**
 * @author Adrian Adewunmi
 * @date 06/01/2022
 * This class is used to create a book object
 */

public class Book extends BookTransactions {
    private final int ISBN;
    private final String author;
    private final String bookTitle;

    /**
     * This is the constructor for the Book class
     * @param ISBN
     * @param author
     * @param bookTitle
     */
    public Book(int ISBN, String author, String bookTitle) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.ISBN = ISBN;
    }

    public int getISBN() {
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
