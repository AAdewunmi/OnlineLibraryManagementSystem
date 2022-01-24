package com.librarymanagementsystem.books;

import java.util.Date;

/**
 * @author Adrian Adewunmi
 * @date 06/01/2022
 * This class is used to create a book object
 */
public class Book {
    private final String ISBN;
    private final String author;
    private final String bookTitle;
    private final String publisher;
    private final String edition;
    private final String subject;
    private final int numberOfPages;
    private final String publicationDate;
    private final String purchaseDate;
    private final double bookPrice;

    public Book(String ISBN, String author, String bookTitle, String publisher, String edition,
                String subject, int numberOfPages, String publicationDate, double bookPrice, String purchaseDate) {
        this.ISBN = ISBN;
        this.author = author;
        this.bookTitle = bookTitle;
        this.publisher = publisher;
        this.edition = edition;
        this.subject = subject;
        this.numberOfPages = 0;
        this.publicationDate = publicationDate;
        this.purchaseDate = purchaseDate;
        this.bookPrice = bookPrice;

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

    public String getPublisher() {
        return publisher;
    }

    public String getEdition() {
        return edition;
    }

    public String getSubject() {
        return subject;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public String toString(){
        return "\nISBN: " + this.ISBN + "\n"
                + "Author: " + this.author + "\n"
                + "Book Title: " + this.bookTitle + "\n"
                + "Publisher: " + this.publisher + "\n"
                + "Edition: " + this.edition + "\n"
                + "Subject: " + this.subject + "\n"
                + "Number of Pages: " + this.numberOfPages + "\n"
                + "Publication Date: " + this.publicationDate + "\n";
    }
}
