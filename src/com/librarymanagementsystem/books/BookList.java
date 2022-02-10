package com.librarymanagementsystem.books;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private final List<Book> bookList;

    public BookList() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.bookList.add(book);
    }

    public void removeBook(Book book) {
        this.bookList.remove(book);
    }

    public void printABook(String string){
        for (Book book: bookList) {
            if (book.getAuthor().equals(string)) {
                System.out.println(book);
            }
            if (book.getBookTitle().equals(string)) {
                System.out.println(book);
            }
            if(book.getISBN().equals(string)){
                System.out.println(book);
            }
        }
    }
    public void printAllBooks() {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    // Total number of books
    public int getTotalBooks() {
        return bookList.size();
    }

    public boolean searchBookByAuthor(String author) {
        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                return true;
            }
        }
        return false;
    }

    public boolean searchBookByTitle(String title) {
        for (Book book : bookList) {
            if (book.getBookTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public boolean searchBookByISBN(String ISBN) {
        for (Book book : bookList) {
            if (book.getISBN().equals(ISBN)) {
                return true;
            }
        }
        return false;
    }

}
