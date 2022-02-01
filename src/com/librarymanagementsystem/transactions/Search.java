package com.librarymanagementsystem.transactions;

import com.librarymanagementsystem.books.Book;

import java.util.List;

public interface Search {
    public List<Book> searchByTitle(String title);
    public List<Book> searchByAuthor(String author);
    public List<Book> searchByPublisher(String subject);
    public List<Book> searchByCategory(String publishDate);
}
