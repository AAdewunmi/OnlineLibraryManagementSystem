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



    public Book(String ISBN, String author, String bookTitle){
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
