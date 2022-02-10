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

       // Create a new book (Programming Books)
        Book book1 = new Book("123", "Dan Morelli", "Java Programming");
        Book book2 = new Book("456", "James Dietel", "C++ Programming");
        Book book3 = new Book("789", "John Walls", "C Programming");
        Book book4 = new Book("101", "Johnas Deepu", "Python Programming");

        // Create a new book (Software Engineering Books)
        Book book5 = new Book("102", "Richard Thor", "Systems Engineering");
        Book book6 = new Book("103", "Billy Kay", "Software Methodology");
        Book book7 = new Book("104", "Edward Bally", "Software Architecture");
        Book book8 = new Book("105", "James Korbin", "Engineering Management");

        // Add book to list of programming books
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
        //System.out.println("Total number of Programming books: " + programmingBookList.getTotalBooks());

        // Add book to list of software engineering books
        BookList softwareEngineeringList = new BookList();
        softwareEngineeringList.addBook(book5);
        softwareEngineeringList.addBook(book6);
        softwareEngineeringList.addBook(book7);
        softwareEngineeringList.addBook(book8);
//        softwareEngineeringList.printABook("Richard Thor");
//        System.out.println("----------");
//        softwareEngineeringList.printAllBooks();
//        softwareEngineeringList.printABook("Software Architecture");
//        System.out.println("----------");
//        softwareEngineeringList.printAllBooks();
//        System.out.println("Total number of Software Engineering books: " + softwareEngineeringList.getTotalBooks());

        // Add list of programming books to bookshelf
        BookShelf programmingBookShelf = new BookShelf();
        programmingBookShelf.addBookList("Programming Books ", programmingBookList);
        //programmingBookShelf.printABook("Dan Morelli");
        //System.out.println("----------");
        //programmingBookShelf.printAllBooks();
        //System.out.println("Total number of Programming books on shelf: " + programmingBookShelf.totalBooksOnShelf());

        // Add list of software engineering to bookshelf
        BookShelf softwareEngineeringBookShelf = new BookShelf();
        softwareEngineeringBookShelf.addBookList("Software Engineering", softwareEngineeringList);
//        softwareEngineeringBookShelf.printABook("Richard Thor");
//        System.out.println("------------");
//        softwareEngineeringBookShelf.printAllBooks();
        //System.out.println("Total number of Software Engineering books on shelf: " + softwareEngineeringBookShelf.totalBooksOnShelf());

        // Add bookshelf to catalogue
        BookCatalogue shelfOneCatalog = new BookCatalogue();
        shelfOneCatalog.addBookShelf("Book Shelf 1 ", programmingBookShelf);
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
        //programmingBookList.searchBookByISBN("789");
        //programmingBookShelf.searchBookByISBN("789");
        //programmingBookCatalog.searchByISBN("789");

    }
}
