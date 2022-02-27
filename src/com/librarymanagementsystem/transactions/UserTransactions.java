package com.librarymanagementsystem.transactions;

import com.librarymanagementsystem.book.Book;

import java.util.List;

/**
 * @author Adrian Adewunmi
 * @date 24/01/2022
 * This class is used to create an account object
 */
public class UserTransactions implements Search{

    // Reserve a book
    public void reserveBook() {

    }

    // Borrow a book
    public void borrowBook() {

    }

    // Renew a book
    public void renewBook() {

    }

    // Return a book
    public void returnBook() {

    }

    @Override
    public List<Book> searchByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> searchByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> searchByISBN(String ISBN) {
        return null;
    }
}
