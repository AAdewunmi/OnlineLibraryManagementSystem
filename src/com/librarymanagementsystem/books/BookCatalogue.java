package com.librarymanagementsystem.books;

import com.librarymanagementsystem.transactions.Search;

import javax.sound.midi.SoundbankResource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookCatalogue implements Search {
    private Map<String, BookShelf> bookCatalogue;

    public BookCatalogue() {
        bookCatalogue = new HashMap<>();
    }

    public void addBookShelf(String shelfName, BookShelf bookShelf) {
        bookCatalogue.put(shelfName, bookShelf);
    }

    public void printABook(String string){
        for (Map.Entry<String, BookShelf> entry : bookCatalogue.entrySet()){
            if (entry.getValue().searchBookByAuthor(string)) {
                System.out.println(entry.getKey());
                entry.getValue().printABook(string);
            }else{
                System.out.println("Book Cannot Be Found!");
            }
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
        return null;
    }

    @Override
    public List<Book> searchByISBN(String ISBN) {
        return null;
    }

    @Override
    public String toString() {
        return "BookCatalogue{" +
                "bookCatalogue=" + bookCatalogue +
                '}';
    }
}
