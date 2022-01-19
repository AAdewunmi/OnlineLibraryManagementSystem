package com.librarymanagementsystem.books;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Adrian Adewunmi
 * @date 08/01/2022
 * This class is used to create a book catalogue object
 */
public class BookCatalogue {

    private Map<String, Book> scienceCatalogue;
    private Map<String, Book> technologyCatalogue;
    private Map<String, Book> engineeringCatalogue;
    private Map<String, Book> mathematicsCatalogue;

    //    private ArrayList<Book> sciences;
    //    private HashMap<String, ArrayList<Book>> science;
    //    private HashMap<String, ArrayList<Book>> technology;
    //    private HashMap<String, ArrayList<Book>> engineering;
    //    private HashMap<String, ArrayList<Book>> mathematics;
    // private int totalNumberOfBooks;
    // TODO: 08/01/2022: Update the book catalogue.
    // 1. Insert a new book into a category
    // 2. Search for a book in a category
    // 3. Remove a book from a category
    // 4. Sorting!!!
    // Test Class: BookCatalogueTest.java
    /*public static void main(String[] args) {
        // books
        ArrayList<BookAuthor> scienceBookAuthors = new ArrayList<>();
        scienceBookAuthors.add(new BookAuthor("123", "Physics Today", "Elsevier", "1st",
                "Science", 1000, "Joe Bull", "22-01-2020"));
        scienceBookAuthors.add(new BookAuthor("234", "Chemistry Tomorrow", "Elsevier", "2st",
                "Science", 1234,"James Last", "02-05-1999"));
        scienceBookAuthors.add(new BookAuthor("456", "Biology Forever", "Elsevier", "4st",
                "Science", 600, "Bill First", "11-07-1921"));
        // catalogue
        HashMap<String, ArrayList<BookAuthor>> science = new HashMap<>();
        science.put("Science Category ", scienceBookAuthors);
        science.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ":\n" + entry.getValue() + "\n");
        } );
    }*/
}
