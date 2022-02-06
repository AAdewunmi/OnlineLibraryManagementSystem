package com.librarymanagementsystem.books;

import java.util.*;

public class BookShelf {

    private Map<String, BookList> bookShelf;

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

    public boolean searchBookByAuthor(String author) {
        for (Map.Entry<String, BookList> entry : bookShelf.entrySet()) {
            if (entry.getValue().searchBookByAuthor(author)) {
                return true;
            }
        }
        return false;
    }

}
