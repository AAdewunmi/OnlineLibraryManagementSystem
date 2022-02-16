package com.librarymanagementsystem;

import com.librarymanagementsystem.books.*;
import com.librarymanagementsystem.librarian.Librarian;

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
        Librarian librarian = new Librarian();
        //librarian.countAllBooksInCatalogue();
       // Create a new book (Programming Books)
        Book book1 = new Book("123", "Dan Morelli", "Java Programming", 5);
        Book book2 = new Book("456", "James Dietel", "C++ Programming", 5);
        Book book3 = new Book("789", "John Walls", "C Programming", 5);
        Book book4 = new Book("101", "Johnas Deepu", "Python Programming", 5);

        // Create a new book (Software Engineering Books)
        Book book5 = new Book("102", "Richard Thor", "Systems Engineering", 5);
        Book book6 = new Book("103", "Billy Kay", "Software Methodology", 5);
        Book book7 = new Book("104", "Edward Bally", "Software Architecture", 5);
        Book book8 = new Book("105", "James Korbin", "Engineering Management", 5);

        // Add book to list of programming books
        BookList programmingBookList = new BookList();
        programmingBookList.addBook(book1);
        programmingBookList.addBook(book2);
        programmingBookList.addBook(book3);
        programmingBookList.addBook(book4);

        // Add book to list of software engineering books
        BookList softwareEngineeringList = new BookList();
        softwareEngineeringList.addBook(book5);
        softwareEngineeringList.addBook(book6);
        softwareEngineeringList.addBook(book7);
        softwareEngineeringList.addBook(book8);

        // Add list of programming books to bookshelf
        BookShelf programmingBookShelf = new BookShelf();
        programmingBookShelf.addBookList("Programming Books ", programmingBookList);

        // Add list of software engineering to bookshelf
        BookShelf softwareEngineeringBookShelf = new BookShelf();
        softwareEngineeringBookShelf.addBookList("Software Engineering", softwareEngineeringList);

        System.out.println("=====Test Catalogue======");
        // Add bookshelf to catalogue
        // Shelf 1
        BookCatalogue shelfOneCatalog = new BookCatalogue();
        shelfOneCatalog.addBookShelf("Book Shelf 1", programmingBookShelf);
        shelfOneCatalog.countBooks();
        //shelfOneCatalog.printAllBooks();
        System.out.println("-------------------------");
        // Shelf 2
        BookCatalogue shelfTwoCatalog = new BookCatalogue();
        shelfTwoCatalog.addBookShelf("Book Shelf 2", softwareEngineeringBookShelf);
        shelfTwoCatalog.countBooks();
        //shelfTwoCatalog.printAllBooks();
    }
}
