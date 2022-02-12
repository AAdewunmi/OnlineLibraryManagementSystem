package com.librarymanagementsystem.books;

/**
 * @author Adrian Adewunmi
 * @date 06/01/2022
 * This class is used to create a book object
 */
public class Book {
    private String ISBN;
    private String author;
    private String bookTitle;
    private String publisher;
    private String edition;
    private String subject;
    private int numberOfPages;
    private String publicationDate;
    private String purchaseDate;
    private double bookPrice;
    private int bookQuantity;

    public Book(String ISBN, String author, String bookTitle, String publisher, String edition,
                String subject, int numberOfPages, String publicationDate, double bookPrice, String purchaseDate,
                int bookQuantity) {
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
        this.bookQuantity = 0;
    }

    public Book(String ISBN, String author, String bookTitle, int bookQuantity){
        this.author = author;
        this.bookTitle = bookTitle;
        this.ISBN = ISBN;
        this.bookQuantity = 0;
    }

    // set year of publication
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setBookPrice(double bookPrice) {
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
                + "Publisher: " + this.publisher + "\n"
                + "Edition: " + this.edition + "\n"
                + "Subject: " + this.subject + "\n"
                + "Number of Pages: " + this.numberOfPages + "\n"
                + "Publication Date: " + this.publicationDate + "\n";
    }

}
