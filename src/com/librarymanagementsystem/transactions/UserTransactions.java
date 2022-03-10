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
    /**
     * This method is used to add a book to the library
     */
    protected final List<Book> listOfBooks = new ArrayList<>();
    public void addBook(Book book){
        listOfBooks.add(book);
    }

    /**
     * This method is used to remove a book from the library
     * @param book: book to be removed
     */
    public void removeBook(Book book){
        listOfBooks.remove(book);
    }

    /**
     * This method is used to print all the books in the library
     */
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

    /**
     * This method is used to search a book by author
     * @param author:
     * @return
     */
    @Override
    public boolean searchByAuthor(String author) {
        for (Book book : listOfBooks){
            if (book.getAuthor().equals(author)){
                return true;
            }
        }
        return false;
    }
    /**
     * This method is used to search a book by title
     * @param title:
     * @return
     */
    @Override
    public boolean searchByTitle(String title) {
        for(Book book : listOfBooks){
            if (book.getBookTitle().equals(title)){
                return true;
            }
        }
        return false;
    }
    /**
     * This method is used to search a book by ISBN
     * @param ISBN: ISBN of the book
     * @return
     */
    @Override
    public boolean searchByISBN(int ISBN) {
        for(Book book : listOfBooks){
            if (book.getISBN() == ISBN){
                return true;
            }
        }
        return false;
    }

}
