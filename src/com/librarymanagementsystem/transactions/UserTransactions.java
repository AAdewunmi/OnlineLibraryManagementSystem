package com.librarymanagementsystem.transactions;

import com.librarymanagementsystem.book.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Adrian Adewunmi
 * @date 24/01/2022
 * Stores and manages the shared catalogue of books for users who can perform
 * library transactions.
 */
public class UserTransactions implements Search{

    private List<Book> listOfBooks;

    /**
     * Creates an empty, synchronized book catalogue.
     */
    public UserTransactions() {
        this.listOfBooks = Collections.synchronizedList(new ArrayList<>());
    }

    /**
     * Adds a book to the catalogue.
     *
     * @param ISBN the ISBN of the book
     * @param name the author name
     * @param title the book title
     */
    public void addBook(int ISBN, String name, String title){
        Book book = new Book(ISBN, name, title);
        listOfBooks.add(book);
    }

    /**
     * Removes books with the matching ISBN from the catalogue.
     *
     * @param ISBN the ISBN of the book to remove
     */
    public void removeBook(int ISBN){
        listOfBooks.removeIf(book1 -> book1.getISBN() == ISBN);
    }

    /**
     * Prints every book in the catalogue.
     */
    public void printAllBooks(){
        for (Book book : listOfBooks){
            System.out.println(book);
        }
    }

    /**
     * Prints a book that matches the supplied ISBN.
     *
     * @param ISBN the ISBN to print
     */
    public void printABook(int ISBN) {
        for (Book book : listOfBooks){
            if (book.getISBN() == ISBN){
                System.out.println(book);
            }
        }
    }

    /**
     * Prints books that match the supplied title.
     *
     * @param title the title to print
     */
    public void printABookTitle(String title) {
        for (Book book : listOfBooks){
            if (book.getBookTitle().equalsIgnoreCase(title)){
                System.out.println(book);
            }
        }
    }

    /**
     * Prints books that match the supplied author.
     *
     * @param author the author to print
     */
    public void printABookAuthor(String author) {
        for (Book book : listOfBooks){
            if (book.getAuthor().equalsIgnoreCase(author)){
                System.out.println(book);
            }
        }
    }

    /**
     * Gets the current catalogue list.
     *
     * @return the list of books
     */
    public List<Book> getListOfBooks(){
        return listOfBooks;
    }

    /**
     * Searches the catalogue by author.
     *
     * @param author the author of the book
     * @return true when a matching book is found; otherwise false
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
     * Searches the catalogue by title.
     *
     * @param title the title of the book
     * @return true when a matching book is found; otherwise false
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
     * Searches the catalogue by ISBN.
     *
     * @param ISBN the ISBN of the book
     * @return true when a matching book is found; otherwise false
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
