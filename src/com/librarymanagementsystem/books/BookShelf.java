package com.librarymanagementsystem.books;

import java.util.HashMap;
import java.util.Map;

public class BookShelf {
    private Map<String, BookList> bookShelf;

    public BookShelf() {
        bookShelf = new HashMap<>();
    }

    public void addBookList(String category, BookList bookList) {
        bookShelf.put(category, bookList);
    }

    public void printAllBooks() {
        for (Map.Entry<String, BookList> entry : bookShelf.entrySet()) {
            System.out.println("Category: " + entry.getKey());
            entry.getValue().printAllBooks();
        }
    }
}
