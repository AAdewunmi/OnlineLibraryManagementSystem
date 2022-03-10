package com.librarymanagementsystem;

import administrator.Administrator;
import com.sun.deploy.security.BlacklistedCerts;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author Adrian Adewunmi
 * @date 19/01/2022
 * This is the main class of the library management system.
 * It gives the UI for the user to interact with the system.
 */
public class LibraryMain {
    // TODO: 1 ADMINISTRATOR, 2 LIBRARIAN, 6 STUDENTS.
    public static void main(String[] args) {
        int menuChoice;
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
        do {
            System.out.println("\nPlease select an option:\n" +
                    "\n1. Admin Login" +
                    "\n2. Librarian Login" +
                    "\n3. Student Login" +
                    "\n4. Exit");
            menuChoice = scanner.nextInt();
            switch (menuChoice) {
                case 1:
                    // Administrator Login Menu
                    do {
                        System.out.println("\n*** Administrator Login ***");
                        System.out.println("Please select an option: "
                                + "\n1. Login"
                                + "\n2. Exit");
                        loginChoice = scanner.nextInt();
                        switch (loginChoice) {
                            case 1:
                                System.out.println("Loging ... ");
                                System.out.println("\nPlease enter your login details: ");
                                System.out.print("Username: ");
                                String username = scanner.next();
                                System.out.print("Password: ");
                                String password = scanner.next();
                                if (admin.adminLogin(username, password)) {
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
                                                Scanner scanner1 = new Scanner(System.in);
                                                char y;
                                                do {
                                                    System.out.println("Register a new librarian ... ");
                                                    System.out.println("\nPlease enter the details of the new librarian: ");
                                                    System.out.print("Enter the librarian's name: \n");
                                                    String librarianName = scanner1.nextLine();
                                                    System.out.println("Enter the librarian's Email Address: ");
                                                    String librarianEmail = scanner1.nextLine();
                                                    System.out.print("Enter the librarian's user ID Number: \n");
                                                    int librarianIDNumber = scanner1.nextInt();
                                                    System.out.println("Enter the librarian's User Name: ");
                                                    String librarianUserName = scanner1.next();
                                                    System.out.println("Enter the librarian's Password: ");
                                                    String librarianPassword = scanner1.next();
                                                    if (admin.searchLibrarian(librarianIDNumber)) {
                                                        System.out.println("Librarian already exists");
                                                        System.out.println("Do you want to add another librarian? (y/n)");
                                                    } else {
                                                        admin.createLibrarian(librarianName, librarianIDNumber, librarianEmail, librarianUserName, librarianPassword);
                                                        System.out.println("Librarian successfully registered!");
                                                        System.out.println("\nDo you want to register another librarian? (y/n)");
                                                    }
                                                    y = scanner1.next().charAt(0);
                                                } while (y == 'y');
                                                break;
                                            case 2:
                                                char z;
                                                do {
                                                    System.out.println("Delete a librarian ... ");
                                                    System.out.println("\nPlease enter the details of the librarian to be deleted: ");
                                                    System.out.print("Enter the librarian's user ID Number: ");
                                                    int librarianIDNumber = scanner.nextInt();
                                                    if (admin.searchLibrarian(librarianIDNumber)) {
                                                        admin.removeLibrarian(librarianIDNumber);
                                                        System.out.println("Librarian successfully deleted!");
                                                        System.out.println("Do you want to add another librarian? (y/n)");
                                                    } else {
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
                                                Scanner scanner2 = new Scanner(System.in);
                                                char a;
                                                do {
                                                    System.out.println("Register a new student ... ");
                                                    System.out.println("\nPlease enter the details of the new student: ");
                                                    System.out.print("Enter the student's name: \n");
                                                    String studentName = scanner2.nextLine();
                                                    System.out.println("Enter the student's Email Address: ");
                                                    String studentEmail = scanner2.nextLine();
                                                    System.out.print("Enter the student's user ID Number: \n");
                                                    int studentIDNumber = scanner2.nextInt();
                                                    System.out.println("Enter the student's username: ");
                                                    String studentUserName = scanner2.next();
                                                    System.out.println("Enter the student's password: ");
                                                    String studentPassword = scanner2.next();
                                                    if (admin.searchStudent(studentIDNumber)) {
                                                        System.out.println("Student already exists");
                                                        System.out.println("Do you want to add another student? (y/n)");
                                                    } else {
                                                        admin.createStudent(studentName, studentIDNumber, studentEmail, studentUserName, studentPassword);
                                                        System.out.println("Student successfully registered!");
                                                        System.out.println("\nDo you want to register another Student? (y/n)");
                                                    }
                                                    a = scanner2.next().charAt(0);
                                                } while (a == 'y');
                                                break;
                                            case 5:
                                                char b;
                                                do {
                                                    System.out.println("Delete a student ... ");
                                                    System.out.println("\nPlease enter the details of the student to be deleted: ");
                                                    System.out.print("Enter the student's user ID Number: ");
                                                    int studentIDNumber = scanner.nextInt();
                                                    if (admin.searchStudent(studentIDNumber)) {
                                                        admin.removeStudent(studentIDNumber);
                                                        System.out.println("Student successfully deleted!");
                                                        System.out.println("Do you want to add another student? (y/n)");
                                                    } else {
                                                        System.out.println("Student does not exist");
                                                        System.out.println("\nDo you want to delete another student? (y/n)");
                                                    }
                                                    b = scanner.next().charAt(0);

                                                } while (b == 'y');
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
                                System.out.println("Loging Out ... \nExiting Administrator Login Menu");
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                                break;
                        }

                    } while (loginChoice != 2);
                    break;
                case 2:
                    do {
                        System.out.println("*** Librarian Login ***");
                        System.out.println("Please select an option: ");
                        System.out.println("1. Login");
                        System.out.println("2. Exit");
                        librarianMenuChoice = scanner.nextInt();
                        switch (librarianMenuChoice){
                            case 1:
                                System.out.println("Loging ... ");
                                System.out.println("\nPlease enter your login details: ");
                                System.out.print("Username: ");
                                String username = scanner.next();
                                System.out.print("Password: ");
                                String password = scanner.next();
                                if (admin.librarianLogin(username, password)) {
                                    do {
                                        System.out.println("\n*** Librarian Menu ***\n"
                                                + "Please select an option from the menu below:\n"
                                                + "1. Search Book\n"
                                                + "2. Add Book\n"
                                                + "3. Remove Book\n"
                                                + "4. Print Books\n"
                                                + "5. Exit to Librarian Login Menu\n");
                                        librarianMenuChoice = scanner.nextInt();
                                        switch (librarianMenuChoice) {
                                            case 1:
                                                // TODO: Find book and display details
                                                System.out.println("Search Book\nby Title, Author, or ISBN");
                                                break;
                                            case 2:
                                                Scanner scannerRegisterBook = new Scanner(System.in);
                                                char c;
                                                do {
                                                    System.out.println("Register Book ... ");
                                                    System.out.print("Enter Book ISBN: ");
                                                    int isbn = scannerRegisterBook.nextInt();
                                                    scannerRegisterBook.nextLine();
                                                    System.out.print("Enter Book Author Name: ");
                                                    String author = scannerRegisterBook.nextLine();
                                                    System.out.print("Enter Book Title: ");
                                                    String title = scannerRegisterBook.nextLine();
                                                    admin.addBook(isbn, author, title);
                                                    System.out.println("Do you want to add another book? (y/n)");
                                                    c = scannerRegisterBook.next().charAt(0);
                                                }while (c == 'y');
                                                break;
                                            case 3:
                                                System.out.println("Remove Book");
                                                break;
                                            case 4:
                                                System.out.println("Print Books");
                                                admin.printBooks();
                                                break;
                                            case 5:
                                                System.out.println("Exit to Librarian Login Menu");
                                                break;
                                        }
                                    }while (librarianMenuChoice != 5);
                                    break;
                                }
                                break;
                            case 2:
                                System.out.println("Loging Out ... \nExiting Librarian Login Menu");
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                    } while (librarianMenuChoice != 2);
                    break;
                case 3:
                    System.out.println("*** Student Login ***");
                    break;
                case 4:
                    System.out.println("Exiting the ...\nLibrary Management System (LMS)");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (menuChoice != 4);
        scanner.close();
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
    }
}
