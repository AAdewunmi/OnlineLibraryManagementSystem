package com.librarymanagementsystem.books;

/**
 * @author Adrian Adewunmi
 * @date 06/01/2022
 * This class is used to create a book object
 */
public class Book {
    private final String ISBN;
    private final String author;
    private final String bookTitle;
    private int bookQuantity;


    public Book(String ISBN, String author, String bookTitle, int bookQuantity){
        this.author = author;
        this.bookTitle = bookTitle;
        this.ISBN = ISBN;
        this.bookQuantity = 0;
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

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public String toString(){
        return "\nISBN: " + this.ISBN + "\n"
                + "Author: " + this.author + "\n"
                + "Book Title: " + this.bookTitle + "\n"
                + "Book Quantity: " + this.bookQuantity;
    }

}
