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
                System.out.println(entry.getKey());
                entry.getValue().printABook(author);
            }else{
                System.out.println("Book cannot be found!");
            }
        }
        return null;
    }

    @Override
    public List<Book> searchByTitle(String title) {
        for (Map.Entry<String, BookShelf> entry : bookCatalogue.entrySet()) {
            if (entry.getValue().searchBookByTitle(title)) {
                System.out.println("Book has been found!\nBook Details: ");
                System.out.println(entry.getKey());
                entry.getValue().printABook(title);
            }else{
                System.out.println("Book cannot be found!");
            }
        }
        return null;
    }

    @Override
    public List<Book> searchByISBN(String ISBN) {
        return null;
    }

}
