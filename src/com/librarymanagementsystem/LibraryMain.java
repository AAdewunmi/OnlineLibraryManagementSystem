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
        Book book1 = new Book("123", "Dan Morelli", "Java Programming", 1);
        Book book2 = new Book("456", "James Dietel", "C++ Programming", 1);
        Book book3 = new Book("789", "John Walls", "C Programming", 1);
        Book book4 = new Book("101", "Johnas Deepu", "Python Programming", 1);

        // Create a new book (Software Engineering Books)
        Book book5 = new Book("102", "Richard Thor", "Systems Engineering", 1);
        Book book6 = new Book("103", "Billy Kay", "Software Methodology", 1);
        Book book7 = new Book("104", "Edward Bally", "Software Architecture", 1);
        Book book8 = new Book("105", "James Korbin", "Engineering Management", 1);

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
        System.out.println("=====Test Catalogue======");
        // Add bookshelf to catalogue
        // Shelf 1
        BookCatalogue shelfOneCatalog = new BookCatalogue();
        shelfOneCatalog.addBookShelf("Book Shelf 1", programmingBookShelf);
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
        shelfOneCatalog.countBooks();
        //shelfOneCatalog.printAllBooks();
        /*Book book9 = new Book("106", "Robert Kimbal", "C# Programming", 1);
        programmingBookList.addBook(book9);
        programmingBookShelf.addBookList("Programming Books ", programmingBookList);
        shelfOneCatalog.addBookShelf("Book Shelf 1", programmingBookShelf);*/
        // shelfOneCatalog.updateCatalogue("Book Shelf 1");
        // =====================================================
        System.out.println("-------------------------");
        // Shelf 2
        BookCatalogue shelfTwoCatalog = new BookCatalogue();
        shelfTwoCatalog.addBookShelf("Book Shelf 2", softwareEngineeringBookShelf);
        shelfTwoCatalog.countBooks();
        //shelfTwoCatalog.printAllBooks();
        // =====================================================
        System.out.println("=====Test Dates======");
        BookItem bookItem1 = new BookItem("123", "Dan Morelli", "Java Programming", 1);
        BookItem bookItem2 = new BookItem("456", "Richard Thor", "Software Architecture", 1);
        bookItem1.bookBorrowedDate();
        bookItem1.bookReturnedDate();
        bookItem1.bookBorrowedDays();
    }
}
