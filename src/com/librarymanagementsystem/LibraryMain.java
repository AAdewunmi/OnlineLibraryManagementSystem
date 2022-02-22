package com.librarymanagementsystem;

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
                    break;
                case 2:
                    System.out.println("Librarian User");
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
