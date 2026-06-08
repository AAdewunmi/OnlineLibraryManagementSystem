package com.librarymanagementsystem.book;

/**
 * @author Adrian Adewunmi
 * @date 06/01/2022
 * Represents a book in the library catalogue.
 *
 * A book stores its identifying details and tracks whether it is currently
 * borrowed.
 */

public class Book {
    private final int ISBN;
    private final String author;
    private final String bookTitle;
    private boolean borrowed;

    /**
     * Creates a book with the supplied catalogue details.
     *
     * @param ISBN the ISBN of the book
     * @param author the author of the book
     * @param bookTitle the title of the book
     */
    public Book(int ISBN, String author, String bookTitle) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.ISBN = ISBN;
        this.borrowed = false;
    }

    /**
     * Gets the book ISBN.
     *
     * @return the ISBN of the book
     */
    public int getISBN() {
        return ISBN;
    }
    /**
     * Gets the book author.
     *
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }
    /**
     * Gets the book title.
     *
     * @return the title of the book
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * Checks whether the book is currently borrowed.
     *
     * @return true when the book is borrowed; otherwise false
     */
    public boolean isBorrowed(){
        return this.borrowed;
    }

    /**
     * Marks the book as borrowed.
     */
    public void borrowed(){
        this.borrowed = true;
    }

    /**
     * Marks the book as returned.
     */
    public void returned(){
        this.borrowed = false;
    }

    /**
     * Formats the book details for console output.
     *
     * @return the book details
     */
    public String toString(){
        return "\nISBN: " + this.ISBN + "\n"
                + "Author: " + this.author + "\n"
                + "Book Title: " + this.bookTitle + "\n";
    }

}
