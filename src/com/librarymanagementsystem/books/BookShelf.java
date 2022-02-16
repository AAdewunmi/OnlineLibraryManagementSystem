package com.librarymanagementsystem.books;

/**
 * @author Adrian Adewunmi
 * @date 16/02/2022
 * This class is used to create a bookshelf object
 */

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

    public int totalBooksOnShelf() {
        int total = 0;
        for (Map.Entry<String, BookList> entry : bookShelf.entrySet()) {
            total += entry.getValue().getTotalBooks();
            System.out.println("Subject Category: " + entry.getKey() + "\n" +
                    "Total Number Of Book Titles: " + total + "\n" +
                     "Total Number Of Book Copies: " + entry.getValue().getTotalBookCopies());
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

}
