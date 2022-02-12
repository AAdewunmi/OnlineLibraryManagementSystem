package com.librarymanagementsystem.books;

import java.util.*;

public class BookShelf {

    private final Map<String, BookList> bookShelf;

    public BookShelf() {
        bookShelf = new HashMap<>();
    }

    public void addBookList(String category, BookList bookList) {
        bookShelf.put(category, bookList);
    }

    public void printABook(String string){
        for (Map.Entry<String, BookList> entry : bookShelf.entrySet()) {
            System.out.println("Category: " + entry.getKey());
            entry.getValue().printABook(string);
        }
    }

    public void printAllBooks() {
        for (Map.Entry<String, BookList> entry : bookShelf.entrySet()) {
            System.out.println("Category: " + entry.getKey());
            entry.getValue().printAllBooks();
        }
    }

    // Total number of books on the shelf
    public int totalBooksOnShelf() {
        int total = 0;
        for (Map.Entry<String, BookList> entry : bookShelf.entrySet()) {
            total += entry.getValue().getTotalBooks();
            System.out.println("Subject Category: " + entry.getKey() +
                    "\nTotal Number Of Books: " + total);
        }
        return total;
    }

    public boolean searchBookByAuthor(String author) {
        for (Map.Entry<String, BookList> entry : bookShelf.entrySet()) {
            if (entry.getValue().searchBookByAuthor(author)) {
                return true;
            }
        }
        return false;
    }

    public boolean searchBookByTitle(String title) {
        for (Map.Entry<String, BookList> entry : bookShelf.entrySet()) {
            if (entry.getValue().searchBookByTitle(title)) {
                return true;
            }
        }
        return false;
    }


    public boolean searchBookByISBN(String ISBN) {
        for (Map.Entry<String, BookList> entry : bookShelf.entrySet()){
            if (entry.getValue().searchBookByISBN(ISBN)) {
                return true;
            }
        }
        return false;
    }

    // Update Books
    public void updateBook(String category, String ISBN, String title, String author, String publisher, String year, String edition, String status) {
        bookShelf.get(category).updateBook(ISBN, title, author, publisher, year, edition, status);
    }
    public void updateBook(Book book) {
    }
}
