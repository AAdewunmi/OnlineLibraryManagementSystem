package com.librarymanagementsystem.books;

import java.util.HashMap;
import java.util.List;
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

    // TODO: Add method to search for book by title
    public List<Book> searchBookByTitle(String title) {
        for (Map.Entry<String, BookShelf> entry : bookCatalogue.entrySet()) {
            List<Book> book = entry.getValue().findBookByTitle(title);
            if (book != null) {
                return book;
            }
        }
        return null;
    }

    // TODO: Add method to search for book by author
    public List<Book> searchBookByAuthor(String author) {
        return null;
    }
    // TODO: Add method to search for book by ISBN
    public List<Book> searchBookByISBN(String ISBN) {
        return null;
    }
}
