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
     * book1: placeholder for book to be removed
     */
    public void removeBook(int ISBN){
        listOfBooks.removeIf(book1 -> book1.getISBN() == ISBN);
    }

    /**
     * This method is used to print all the books in the library
     */
    public void printAllBooks(){
        for (Book book : listOfBooks){
            System.out.println(book);
        }
    }

    // Print a book in the library by ISBN
    public void printABook(int ISBN) {
        for (Book book : listOfBooks){
            if (book.getISBN() == ISBN){
                System.out.println(book.toString());
            }
        }
    }

    // Print a book in the library by title
    public void printABookTitle(String title) {
        for (Book book : listOfBooks){
            if (book.getBookTitle().equalsIgnoreCase(title)){
                System.out.println(book.toString());
            }
        }
    }

    // Print a book in the library by author
    public void printABookAuthor(String author) {
        for (Book book : listOfBooks){
            if (book.getAuthor().equalsIgnoreCase(author)){
                System.out.println(book.toString());
            }
        }
    }

    // +++++++++++++++++++++++++++++++
    // ++++++  Student methods +++++++
    // +++++++++++++++++++++++++++++++


    /**
     * This method is used to search a book by author
     * @param author:
     * @return
     */
    @Override
    public boolean searchByAuthor(String author) {
        for (Book book : listOfBooks){
            if (book.getAuthor().equalsIgnoreCase(author)){
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
            if (book.getBookTitle().equalsIgnoreCase(title)){
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
