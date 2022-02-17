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
        // Create Librarian
        Librarian librarian = new Librarian("Ade Adewunmi", "001","a.ade@akauni.org");
        System.out.println("Librarian Details: " + librarian.getLibrarianName() +","+ librarian.getLibrarianIDNumber()
                +"," + librarian.getLibrarianEmail());
        // Librarian Creates New Book, Then Add To Library
        librarian.addBookToCatalogue("123", "Dan Morelli", "Java Programming", 5,
                "Programming", "Shelf 1");
        librarian.addBookToCatalogue("456", "James Dietel", "C++ Programming", 5,
                "Programming", "Shelf 1");
        librarian.addBookToCatalogue("789", "John Walls", "C Programming", 5,
                "Programming", "Shelf 1");
        librarian.addBookToCatalogue("101", "Johnas Deepu", "Python Programming", 5,
                "Programming", "Shelf 1");
        librarian.addBookToCatalogue("102", "Richard Thor", "Systems Engineering", 5,
                "Software Engineering", "Shelf 2");
        librarian.addBookToCatalogue("103", "Billy Kay", "Software Methodology", 5,
                "Software Engineering", "Shelf 2");
        librarian.addBookToCatalogue("104", "Edward Bally", "Software Architecture", 5,
                "Software Engineering", "Shelf 2");
        librarian.addBookToCatalogue("105", "James Korbin", "Engineering Management", 5,
                "Software Engineering", "Shelf 2");
    }
}
