package com.librarymanagementsystem.books;

import java.util.HashMap;
import java.util.List;

/**
 * @author Adrian Adewunmi
 * @date 08/01/2022
 * This class is used to create a book catalogue object
 */
public class BookCatalogue {
    private HashMap<String, List<Book>> bookTitles;
    private HashMap<String, List<Book>> bookAuthors;
    private HashMap<String, List<Book>> bookSubject;
    private HashMap<String, List<Book>> bookPublishDate;

    public List<Book> searchByTitle(String title){
        return bookTitles.get(title);
    }

    public List<Book> searchByAuthor(String author){
        return bookAuthors.get(author);
    }

    public List<Book> searchBySubject(String subject){
        return bookSubject.get(subject);
    }

    public List<Book> publishDate(String date){
        return bookPublishDate.get(date);
    }

    public void updateCatalog(Book book){
    }
}
