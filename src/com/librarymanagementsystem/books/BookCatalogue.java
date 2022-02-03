package com.librarymanagementsystem.books;

import com.sun.org.apache.xpath.internal.functions.FuncQname;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Adrian Adewunmi
 * @date 08/01/2022
 * This class is used to create a book catalogue object
 */
public class BookCatalogue {
    /*private static Book book;
    private static List<Book> books;
    private static HashMap<String, List<Book>> bookShelf;*/

    /*private List<Book> scienceBooks;
    private HashMap<String, List<Book>> scienceShelf;
    private HashMap<String, List<Book>> technologyShelf;
    private HashMap<String, List<Book>> engineeringShelf;
    private HashMap<String, List<Book>> mathsShelf;*/

   /* public BookCatalogue() {
    }

    // Create book
    public void createBook(String authorName, String bookTitle){
        Book book = new Book(authorName, bookTitle);
    }*/
    // Create list of books
    List<Book> listOfBooks;
    public void createListOfBooks(String authorName, String bookTitle){
        Book book = new Book(authorName, bookTitle);
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(book);
    }
    // Create shelf
    HashMap<String, List<Book>> subjectBookShelf;
    public void createSubjectBookShelf(String subjectName){
        subjectBookShelf = new HashMap<>();
        subjectBookShelf.put(subjectName, listOfBooks);
    }
    // Create catalogue
    // Print catalogue

    /*public void addBookToList(Book book){
        books = new ArrayList<>();
        books.add(book);
    }

    public void addBook(String subject, List<Book> subjectBooks){
        bookShelf = new HashMap<>();
        bookShelf.put(subject, books);
    }*/

    public void printAllBooks(){
        for(Map.Entry<String, List<Book>> entry : subjectBookShelf.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
    }

    public static void main(String[] args) {
        BookCatalogue bookCatalogue = new BookCatalogue();
        // Create List of Book
        bookCatalogue.createListOfBooks("Java", "Adrian Adewunmi");
        bookCatalogue.createListOfBooks("JavaScript", "Adrian Adewunmi");
        bookCatalogue.createListOfBooks("Python", "Adrian Adewunmi");
        bookCatalogue.createListOfBooks("C++", "Adrian Adewunmi");
        // Create Subject Bookshelf
        bookCatalogue.createSubjectBookShelf("Programming Books");
        /*books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        // Create a shelf object
        bookShelf = new HashMap<>();
        bookShelf.put("Programming Books: ", books);
        // Create a catalogue object
        BookCatalogue bookCatalogue = new BookCatalogue();*/
        // Print all books in the book catalogue object
        bookCatalogue.printAllBooks();
    }

    /*public void removeBook(Book book){

    }

    public void updateBook(Book book){

    }

    public void printAllBooks(Book book){

    }*/

    /*public List<Book> searchByAuthor(String query) {
        // return all books containing the string query in their author's name.
        return bookAuthors.get(query);
    }

    public List<Book> searchByTitle(String query) {
        // return all books containing the string query in their title.
        return bookTitles.get(query);
    }

    public List<Book> searchByISBN(String query) {
        // return all books containing the string query in their ISBN.
        return bookISBN.get(query);
    }*/

}
