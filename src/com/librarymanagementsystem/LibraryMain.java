package com.librarymanagementsystem;

import administrator.Administrator;
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
        int loginChoice;
        int adminChoice;
        int mainMenuChoice;
        int studentMenuChoice;
        int librarianMenuChoice;

        Library library = new Library("London University Library",
                "Finsbury Park, London, UK");
        System.out.println(library.toString());
        System.out.println("*** Welcome to the Library Management System (LMS) ***");
        LocalDate date = LocalDate.now();
        System.out.println("*** Date: " + date + " ***");
        Scanner scanner = new Scanner(System.in);
        Administrator admin = new Administrator();
        // Administrator Login Menu
        do {
            System.out.println("\n*** Administrator Login ***");
            System.out.println("Please select an option: "
                                + "\n1. Login"
                                + "\n2. Exit");
            loginChoice = scanner.nextInt();
            switch (loginChoice){
                case 1:
                    System.out.println("Loging ... ");
                    System.out.println("\nPlease enter your login details: ");
                    System.out.print("Username: ");
                    String username = scanner.next();
                    System.out.print("Password: ");
                    String password = scanner.next();
                    if (admin.adminLogin(username, password)){
                        // Administrator Menu after login
                        do {
                            System.out.println("\nPlease select an option from the menu below:\n"
                                    + "1. Register a new librarian\n"
                                    + "2. Delete a librarian\n"
                                    + "3. Print all librarians\n"
                                    + "4. Register a new student\n"
                                    + "5. Delete a student\n"
                                    + "6. Print all students\n"
                                    + "7. Exit\n");
                            adminChoice = scanner.nextInt();
                            switch (adminChoice) {
                                case 1:
                                    char y;
                                    do {
                                        System.out.println("Register a new librarian ... ");
                                        System.out.println("\nPlease enter the details of the new librarian: ");
                                        System.out.print("Enter the librarian's name: ");
                                        String librarianName = scanner.next();
                                        System.out.print("Enter the librarian's user ID Number: ");
                                        String librarianIDNumber = scanner.next();
                                        System.out.println("Enter the librarian's Email Address: ");
                                        String librarianEmail = scanner.next();
                                        if(admin.searchLibrarian(librarianIDNumber)){
                                            System.out.println("Librarian already exists");
                                            System.out.println("Do you want to add another librarian? (y/n)");
                                        }else {
                                            admin.createLibrarian(librarianName, librarianIDNumber, librarianEmail);
                                            System.out.println("Librarian successfully registered!");
                                            System.out.println("\nDo you want to register another librarian? (y/n)");
                                        }
                                        y = scanner.next().charAt(0);
                                    } while (y == 'y');
                                    break;
                                case 2:
                                    char z;
                                    do {
                                        System.out.println("Delete a librarian ... ");
                                        System.out.println("\nPlease enter the details of the librarian to be deleted: ");
                                        System.out.print("Enter the librarian's user ID Number: ");
                                        String librarianIDNumber = scanner.next();
                                        if(admin.searchLibrarian(librarianIDNumber)){
                                            admin.removeLibrarian(librarianIDNumber);
                                            System.out.println("Librarian successfully deleted!");
                                            System.out.println("Do you want to add another librarian? (y/n)");
                                        }else {
                                            System.out.println("Librarian does not exist");
                                            System.out.println("\nDo you want to delete another librarian? (y/n)");
                                        }
                                        z = scanner.next().charAt(0);
                                    } while (z == 'y');
                                    break;
                                case 3:
                                    System.out.println("Print a list of all librarians ...");
                                    admin.printLibrarians();
                                    break;
                                case 4:
                                    System.out.println("Register a new student ... ");
                                    admin.createStudent("Ade", "001", "ade@aol.com");
                                    admin.createStudent("Olu", "002", "olu@aol.com");
                                    admin.createStudent("Ola", "003", "ola@aol.com");
                                    break;
                                case 5:
                                    System.out.println("Delete a student ... ");
                                    break;
                                case 6:
                                    System.out.println("Print a list of all students ... ");
                                    admin.printStudents();
                                    break;
                                case 7:
                                    System.out.println("Exiting Administrator Menu ... " +
                                            "\n ... Returning to Administrator Login Menu");
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                                    break;
                            }
                        } while (adminChoice != 7);
                    }
                    break;
                case 2:
                    System.out.println("Loging Out ... \nExiting Library Management System (LMS) ... " +
                            "\nGoodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }while (loginChoice != 2);



       /* TEACHER / STUDENT MENU
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
        }while(mainMenuChoice != 3);*/
        scanner.close();
    }
}
