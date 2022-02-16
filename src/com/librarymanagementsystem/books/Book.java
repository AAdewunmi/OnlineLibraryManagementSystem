package com.librarymanagementsystem.books;

import java.io.PrintStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

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

    public Date bookBorrowedDate(){
        Date date = new Date();
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();
        formatter.format("%tc", calendar, calendar, calendar, calendar, calendar, calendar);
        System.out.println("Book borrowed date is: " + formatter);
        return calendar.getTime();
    }

    public Date bookReturnedDate(){
        Date date = new Date();
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 14);
        calendar.getTime().toString();
        formatter.format("%tc", calendar, calendar, calendar, calendar, calendar, calendar);
        System.out.println("Book returned date is: " + formatter);
        return calendar.getTime();
    }

    public String toString(){
        return "\nISBN: " + this.ISBN + "\n"
                + "Author: " + this.author + "\n"
                + "Book Title: " + this.bookTitle + "\n"
                + "Number of Book Copies: " + this.numberOfBookCopies + "\n";
    }

}
