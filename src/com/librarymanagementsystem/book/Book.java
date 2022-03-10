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
     * @param ISBN: The ISBN of the book
     * @param author: The author of the book
     * @param bookTitle: The title of the book
     */
    public Book(int ISBN, String author, String bookTitle) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.ISBN = ISBN;
    }

    /**
     * This method is used to get the ISBN of the book
     * @return: The ISBN of the book
     */
    public int getISBN() {
        return ISBN;
    }
    /**
     * This method is used to get the author of the book
     * @return: The author of the book
     */
    public String getAuthor() {
        return author;
    }
    /**
     * This method is used to get the title of the book
     * @return: The title of the book
     */
    public String getBookTitle() {
        return bookTitle;
    }
    /**
     * This method is used to get the details of the book
     * @return: The details of the book
     */
    public String toString(){
        return "\nISBN: " + this.ISBN + "\n"
                + "Author: " + this.author + "\n"
                + "Book Title: " + this.bookTitle + "\n";
    }

}
