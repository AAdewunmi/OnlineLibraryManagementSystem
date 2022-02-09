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
        Book book1 = new Book("123", "Dan Morelli", "Java Programming");
        Book book2 = new Book("456", "James Dietel", "C++ Programming");
        Book book3 = new Book("789", "John Walls", "C Programming");
        Book book4 = new Book("101", "Johnas Deepu", "Python Programming");
        // Add book to list of books
        BookList programmingBookList = new BookList();
        programmingBookList.addBook(book1);
        programmingBookList.addBook(book2);
        programmingBookList.addBook(book3);
        programmingBookList.addBook(book4);
        //programmingBookList.printABook("Dan Morelli");
        //System.out.println("----------");
        //programmingBookList.printAllBooks();
        //programmingBookList.printABook("C++ Programming");
        //System.out.println("----------");
        //programmingBookList.printAllBooks();
        // Add list of books to bookshelf
        BookShelf programmingBookShelf = new BookShelf();
        programmingBookShelf.addBookList("Programming Books ", programmingBookList);
        //programmingBookShelf.printABook("Dan Morelli");
        //System.out.println("----------");
        //programmingBookShelf.printAllBooks();
        // Add bookshelf to catalogue
        BookCatalogue programmingBookCatalog = new BookCatalogue();
        programmingBookCatalog.addBookShelf("Book Shelf 1 ", programmingBookShelf);
        //programmingBookCatalog.printABook("Dan Morelli");
        //System.out.println("----------");
        //programmingBookCatalog.printAllBooks();
        // Search for a book
        //programmingBookList.searchBookByAuthor("Dan Morelli");
        //programmingBookShelf.searchBookByAuthor("Dan Morelli");
        //programmingBookCatalog.searchByAuthor("Dan Morelli");
        // =====================================================
        //programmingBookList.searchBookByTitle("C++ Programming");
        //programmingBookShelf.searchBookByTitle("C++ Programming");
        //programmingBookCatalog.searchByTitle("C++ Programming");
        // =====================================================
        programmingBookList.searchBookByISBN("78");
        //programmingBookShelf.searchBookByISBN("789");
        //programmingBookCatalog.searchByISBN("789");
    }
}
