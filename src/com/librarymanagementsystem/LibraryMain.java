package com.librarymanagementsystem;

import com.librarymanagementsystem.book.Book;
import com.librarymanagementsystem.librarian.Librarian;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author Adrian Adewunmi
 * @date 19/01/2022
 * This is the main class of the library management system.
 * It gives the UI for the user to interact with the system.
 */
public class LibraryMain {
    public static void main(String[] args) {
        int mainMenuChoice;
        int studentMenuChoice;
        int librarianMenuChoice;

        Library library = new Library("London University Library",
                "Finsbury Park, London, UK");
        System.out.println(library.toString());
        System.out.println("*** Welcome to the Library Management System (LMS) ***");
        LocalDate date = LocalDate.now();
        System.out.println("Date: " + date);

        do {
            System.out.println("\n*** Main Menu ***\n"
             + "Please select an option from the menu below:\n"
             + "1. Student User\n"
             + "2. Librarian User\n"
             + "3. Exit\n");

            Scanner scanner = new Scanner(System.in);
            mainMenuChoice = scanner.nextInt();

            switch (mainMenuChoice) {
                case 1:
                    System.out.println("Student User");
                    do {
                        System.out.println("\n*** Student Menu ***\n"
                                + "Please select an option from the menu below:\n"
                                + "1. Search Book\n"
                                + "2. Reserve Book\n"
                                + "3. Borrow Book\n"
                                + "4. Renew Book\n"
                                + "5. Return Book\n"
                                + "6. Exit to Main Menu\n");
                        studentMenuChoice = scanner.nextInt();
                        switch (studentMenuChoice) {
                            case 1:
                                System.out.println("Search Book");
                                break;
                            case 2:
                                System.out.println("Reserve Book");
                                break;
                            case 3:
                                System.out.println("Borrow Book");
                                break;
                            case 4:
                                System.out.println("Renew Book");
                                break;
                            case 5:
                                System.out.println("Return Book");
                                break;
                            case 6:
                                System.out.println("Exit to Main Menu");
                                break;
                        }
                    }while (studentMenuChoice != 6);
                    break;
                case 2:
                    System.out.println("Librarian User");
                    do {
                        System.out.println("\n*** Librarian Menu ***\n"
                        + "Please select an option from the menu below:\n"
                        + "1. Search Book\n"
                        + "2. Add Book\n"
                        + "3. Remove Book\n"
                        + "4. Print Books\n"
                        + "5. Exit to Main Menu\n");
                        librarianMenuChoice = scanner.nextInt();
                        switch (librarianMenuChoice) {
                            case 1:
                                System.out.println("Search Book");
                                break;
                            case 2:
                                System.out.println("Add Book");
                                break;
                            case 3:
                                System.out.println("Remove Book");
                                break;
                            case 4:
                                System.out.println("Print Books");
                                break;
                            case 5:
                                System.out.println("Exit to Main Menu");
                                break;
                        }
                    }while (librarianMenuChoice != 5);
                    break;
                case 3:
                    System.out.println("Exiting LMS...\n...Goodbye");
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.out.println("Would you like to try again? (y/n)");
                    char y = scanner.next().charAt(0);
                    if (y == 'y') {
                        System.out.println("Enter your choice again");
                    }else {
                        mainMenuChoice = 3;
                    }
                    System.out.println("Exiting LMS...\n...Goodbye");
                    break;
            }
        }while(mainMenuChoice != 3);
    }

}
