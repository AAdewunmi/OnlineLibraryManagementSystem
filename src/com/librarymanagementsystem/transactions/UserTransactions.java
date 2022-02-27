package com.librarymanagementsystem.transactions;

import com.librarymanagementsystem.book.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adrian Adewunmi
 * @date 24/01/2022
 * This class is used to create an account object
 */
public class UserTransactions implements Search{
    // +++++++++++++++++++++++++++++++
    // ++++++  Librarian  methods ++++
    // +++++++++++++++++++++++++++++++
    // Add a new book to the library
    List<Book> listOfBooks = new ArrayList<>();
    public void addBook(Book book){
        listOfBooks.add(book);
    }

    // Remove a book from the library
    public void removeBook(Book book){
        listOfBooks.remove(book);
    }

    // Print all books in the library
    public void printAllBooks(){
        for (Book book : listOfBooks){
            System.out.println(book);
        }
    }

    // Print a book in the library
    public void printBook(Book book){

    }

    // +++++++++++++++++++++++++++++++
    // ++++++  Student methods +++++++
    // +++++++++++++++++++++++++++++++
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
