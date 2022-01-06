package com.librarymanagementsystem.books;

/**
 * @author Adrian Adewunmi
 * @date 06/01/2022
 * This class is used to create a book object
 */
public class Book {
    private final String bookId;
    private final String bookName;
    private final String author;
    private final String publisher;
    private final String edition;
    private final String category;
    private int quantity;

    public Book(String bookId, String bookName, String author, String publisher, String edition, String category, int quantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.category = category;
        this.quantity = 0;
    }

    public String getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getEdition() {
        return edition;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
