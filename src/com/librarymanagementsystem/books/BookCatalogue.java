package com.librarymanagementsystem.books;

import java.util.HashMap;
import java.util.Map;

public class BookCatalogue {
    private Map<String, BookShelf> bookCatalogue;

    public BookCatalogue() {
        bookCatalogue = new HashMap<>();
    }

    public void addBookShelf(String shelfName, BookShelf bookShelf) {
        bookCatalogue.put(shelfName, bookShelf);
    }

    public void printAllBooks() {
        for (Map.Entry<String, BookShelf> entry : bookCatalogue.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().printAllBooks();
        }
    }
}
