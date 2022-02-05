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

    // Find book by title
    public boolean findBookByTitle(String title) {
        for (Book book : this.bookList) {
            if (book.getBookTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    // Find book by author
    public Book findBookByAuthor(String author) {
        for (Book book : this.bookList) {
            if (book.getAuthor().equals(author)) {
                return book;
            }
        }
        return null;
    }

    // Find book by ISBN
    public Book findBookByISBN(String ISBN) {
        for (Book book : this.bookList) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }

    // Print all books
    public void printAllBooks() {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

}
