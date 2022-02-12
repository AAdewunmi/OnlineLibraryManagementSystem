package com.librarymanagementsystem.books;

import com.librarymanagementsystem.transactions.Search;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookCatalogue implements Search {
    private final Map<String, BookShelf> bookCatalogue;

    public BookCatalogue() {
        bookCatalogue = new HashMap<>();
    }

    public void addBookShelf(String shelfName, BookShelf bookShelf) {
        bookCatalogue.put(shelfName, bookShelf);
    }

    public void printABook(String string){
        for (Map.Entry<String, BookShelf> entry : bookCatalogue.entrySet()){
                System.out.println(entry.getKey());
                entry.getValue().printABook(string);
        }
    }

    public void printAllBooks() {
        for (Map.Entry<String, BookShelf> entry : bookCatalogue.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().printAllBooks();
        }
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        for (Map.Entry<String, BookShelf> entry : bookCatalogue.entrySet()) {
            if (entry.getValue().searchBookByAuthor(author)) {
                System.out.println("Book has been found!\nBook Details: ");
                System.out.println("Location: " + entry.getKey());
                entry.getValue().printABook(author);
            }else{
                System.out.println("No Book found with Author: " + author);
            }
        }
        return null;
    }

    // Count number of books in each shelf
    public void countBooks() {
        for (Map.Entry<String, BookShelf> entry : bookCatalogue.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().totalBooksOnShelf();
        }
    }

    @Override
    public List<Book> searchByTitle(String title) {
        for (Map.Entry<String, BookShelf> entry : bookCatalogue.entrySet()) {
            if (entry.getValue().searchBookByTitle(title)) {
                System.out.println("Book has been found!\nBook Details: ");
                System.out.println("Location: " + entry.getKey());
                entry.getValue().printABook(title);
            }else{
                System.out.println("No Book found with Title: " + title);
            }
        }
        return null;
    }

    @Override
    public List<Book> searchByISBN(String ISBN) {
        for (Map.Entry<String, BookShelf> entry : bookCatalogue.entrySet()) {
            if (entry.getValue().searchBookByISBN(ISBN)) {
                System.out.println("Book has been found!\nBook Details: ");
                System.out.println("Location: " + entry.getKey());
                entry.getValue().printABook(ISBN);
            } else {
                System.out.println("No Book found with ISBN: " + ISBN);
            }
        }
        return null;
    }

    // Update Catalogue
    public void updateCatalogue(String shelfName, Book book) {
        bookCatalogue.get(shelfName).updateBook(book);
    }

}
