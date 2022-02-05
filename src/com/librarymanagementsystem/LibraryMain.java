package com.librarymanagementsystem;

import com.librarymanagementsystem.books.*;

/**
 * @author Adrian Adewunmi
 * @date 19/01/2022
 * This is the main class of the library management system
 */
public class LibraryMain {
    public static void main(String[] args) {
        // Create a new library
        Library library = new Library("A.K. Adewunmi Memorial Library",
                "Ilaro, Ogun State, Nigeria");
        System.out.println(library.getLibraryName() + "\n" + library.getLibraryAddress() + "\n");
       // Create a new book
        Book book1 = new Book("Morelli", "Java Programming");
        Book book2 = new Book("Dietel", "C++ Programming");
        Book book3 = new Book("Walls", "C Programming");
        Book book4 = new Book("Deepu", "Python Programming");
        // Add book to list of books
        BookList programmingBookList = new BookList();
        programmingBookList.addBook(book1);
        programmingBookList.addBook(book2);
        programmingBookList.addBook(book3);
        programmingBookList.addBook(book4);
        // Add list of books to bookshelf
        BookShelf programmingBookShelf = new BookShelf();
        programmingBookShelf.addBookList("Programming Books ", programmingBookList);
        // Add bookshelf to catalogue
        BookCatalogue programmingBookCatalog = new BookCatalogue();
        programmingBookCatalog.addBookShelf("Book Shelf 1 ", programmingBookShelf);
        programmingBookCatalog.printAllBooks();
        // Search for a book
        programmingBookShelf.findBookByTitle("Java Programming");

    }
}
