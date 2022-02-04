package com.librarymanagementsystem.books;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Book> bookList;

    public BookList() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.bookList.add(book);
    }

    public void removeBook(Book book) {
        this.bookList.remove(book);
    }

    // Print all books
    public void printAllBooks() {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
