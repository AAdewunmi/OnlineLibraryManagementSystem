package com.librarymanagementsystem.administrator;

import com.librarymanagementsystem.book.Book;
import com.librarymanagementsystem.librarian.Librarian;
import com.librarymanagementsystem.students.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adrian Adewunmi
 * @date 28/02/2020
 * Coordinates administrator actions for managing librarians, students, and
 * book catalogue operations.
 */

public class Administrator {
    String adminUserName;
    String adminPassword;
    private final List<Librarian> listOfLibrarians;
    private final List<Student> listOfStudents;

    /**
     * Creates an administrator account with empty student and librarian lists.
     */
    public Administrator() {
        this.listOfLibrarians = new ArrayList<Librarian>();
        this.listOfStudents = new ArrayList<Student>();
        this.adminUserName = "admin";
        this.adminPassword = "admin";
    }

    /**
     * Authenticates the built-in administrator account.
     *
     * @param username the supplied username
     * @param password the supplied password
     * @return true when the credentials match; otherwise false
     */
    public boolean adminLogin(String username, String password){
        if(username.equals("admin") && password.equals("admin")){
            System.out.println("Administrator Login Successful!");
            return true;
        }else {
            System.out.println("Administrator Login Failed!");
        }
        return false;
    }

    /**
     * Registers a new librarian.
     *
     * @param librarianName the librarian name
     * @param librarianIDNumber the librarian id number
     * @param librarianEmail the librarian email address
     * @param librarianUserName the librarian username
     * @param librarianPassword the librarian password
     */
    public void createLibrarian(String librarianName, int librarianIDNumber, String librarianEmail, String librarianUserName, String librarianPassword){
        Librarian librarian = new Librarian(librarianName, librarianIDNumber, librarianEmail, librarianUserName, librarianPassword);
        listOfLibrarians.add(librarian);
    }

    /**
     * Removes a librarian by id number.
     *
     * @param librarianIDNumber the librarian id number to remove
     * @return true when a librarian was removed; otherwise false
     */
    public boolean removeLibrarian(int librarianIDNumber){
        for (Librarian librarian : listOfLibrarians) {
            if (librarian.getLibrarianIDNumber() == librarianIDNumber){
                listOfLibrarians.remove(librarian);
                return true;
            }
        }
        return false;
    }

    /**
     * Prints all registered librarians.
     */
    public void printLibrarians(){
        for (Librarian librarian : listOfLibrarians) {
            System.out.println(librarian);
        }
    }

    /**
     * Searches for a librarian by id number.
     *
     * @param librarianIDNumber the librarian id number to search for
     * @return true when a librarian is found; otherwise false
     */
    public boolean searchLibrarian(int librarianIDNumber){
        for (Librarian librarian : listOfLibrarians) {
            if (librarian.getLibrarianIDNumber() == librarianIDNumber){
                return true;
            }
        }
        return false;
    }

    /**
     * Authenticates a registered librarian.
     *
     * @param username the supplied username
     * @param password the supplied password
     * @return true when a matching librarian is found; otherwise false
     */
    public boolean librarianLogin(String username, String password){
        for (Librarian librarian : listOfLibrarians) {
            if(username.equals(librarian.getLibrarianUserName()) && password.equals(librarian.getLibrarianPassword())){
                System.out.println("Librarian Login Successful!");
                return true;
            }else {
                System.out.println("Librarian Login Failed!");
            }
        }
        return false;
    }

    /**
     * Adds a book through each registered librarian catalogue.
     *
     * @param ISBN the ISBN of the book
     * @param name the author name
     * @param title the book title
     */
    public void addBook(int ISBN, String name, String title){
        for (Librarian librarian : listOfLibrarians) {
            if (!librarian.searchByISBN(ISBN)) {
                librarian.addBook(ISBN, name, title);
                System.out.println("Book added successfully\nBy: " + librarian.getLibrarianName());
            } else {
                System.out.println("Book already exists\n");
            }
        }
    }

    /**
     * Removes a book from registered librarian catalogues.
     *
     * @param ISBN the ISBN of the book to remove
     */
    public void removeBook(int ISBN){
        for (Librarian librarian : listOfLibrarians) {
            if (librarian.searchByISBN(ISBN)) {
                librarian.removeBook(ISBN);
                System.out.println("Book removed successfully\nBy: " + librarian.getLibrarianName());
            }else {
                System.out.println("Book does not exist\n");
            }
        }
    }

    /**
     * Searches librarian catalogues by ISBN.
     *
     * @param ISBN the ISBN to search for
     * @return true when a matching book is found; otherwise false
     */
    public boolean searchBookISBN(int ISBN){
        for (Librarian librarian : listOfLibrarians) {
            if (librarian.searchByISBN(ISBN)) {
                System.out.println("Book found!");
                librarian.printABook(ISBN);
                return true;
            }
        }
        System.out.println("Book does not exist!\n");
        return false;
    }

    /**
     * Searches librarian catalogues by title.
     *
     * @param title the title to search for
     * @return true when a matching book is found; otherwise false
     */
    public boolean searchBookTitle(String title){
        for (Librarian librarian : listOfLibrarians) {
            if (librarian.searchByTitle(title)) {
                System.out.println("Book found!");
                librarian.printABookTitle(title);
                return true;
            }
        }
        System.out.println("Book does not exist!\n");
        return false;
    }

    /**
     * Searches librarian catalogues by author.
     *
     * @param name the author name to search for
     * @return true when a matching book is found; otherwise false
     */
    public boolean searchBookAuthor(String name){
        for (Librarian librarian : listOfLibrarians) {
            if (librarian.searchByAuthor(name)) {
                System.out.println("Book found!");
                librarian.printABookAuthor(name);
                return true;
            }
        }
        System.out.println("Book does not exist!\n");
        return false;
    }

    /**
     * Prints all books from registered librarian catalogues.
     */
    public void printBooks(){
        for (Librarian librarian : listOfLibrarians) {
            librarian.printAllBooks();
        }
    }

    /**
     * Registers a new student.
     *
     * @param name the student name
     * @param studentId the student id
     * @param email the student email address
     * @param userName the student username
     * @param password the student password
     */
    public void createStudent(String name, int studentId, String email, String userName, String password){
        Student student = new Student(name, studentId, email, userName, password);
        listOfStudents.add(student);
    }

    /**
     * Prints all registered students.
     */
    public void printStudents(){
        for (Student student : listOfStudents) {
            System.out.println(student);
        }
    }

    /**
     * Searches for a student by id number.
     *
     * @param studentIDNumber the student id number to search for
     * @return true when a student is found; otherwise false
     */
    public boolean searchStudent(int studentIDNumber){
        for (Student student : listOfStudents) {
            if (student.getStudentId() == studentIDNumber){
                return true;
            }
        }
        return false;
    }

    /**
     * Removes a student by id number.
     *
     * @param studentIDNumber the student id number to remove
     * @return true when a student was removed; otherwise false
     */
    public boolean removeStudent(int studentIDNumber){
        for (Student student : listOfStudents) {
            if (student.getStudentId() == studentIDNumber){
                listOfStudents.remove(student);
                return true;
            }
        }
        return false;
    }


    /**
     * Authenticates a registered student.
     *
     * @param username the supplied username
     * @param password the supplied password
     * @return true when a matching student is found; otherwise false
     */
    public boolean studentLogin(String username, String password){
        for (Student student : listOfStudents) {
            if(username.equals(student.getStudentUsername()) && password.equals(student.getStudentPassword())){
                System.out.println("Student Login Successful!");
                return true;
            }else {
                System.out.println("Student Login Failed!");
            }
        }
        return false;
    }

    /**
     * Searches available librarian catalogues from each student account by ISBN.
     *
     * @param isbn the ISBN to search for
     */
    public void findBookByISBNFromStudentAccount(int isbn){
        for (Librarian librarian: listOfLibrarians) {
            for (Student student : listOfStudents) {
                student.getAllBooksFromUserTransactions((ArrayList<Book>)
                        librarian.getListOfBooks());
                if (student.findBookByISBNFromStudentAccount(isbn)) {
                    student.printABookFromStudentAccount(isbn);
                }else{
                    System.out.println("Book does not exit");
                }
            }
        }
    }

    /**
     * Searches available librarian catalogues from each student account by title.
     *
     * @param title the title to search for
     */
    public void findBookByTitleFromStudentAccount(String title){
        for (Librarian librarian: listOfLibrarians) {
            for (Student student : listOfStudents) {
                student.getAllBooksFromUserTransactions((ArrayList<Book>)
                        librarian.getListOfBooks());
                if (student.findBookByTitleFromStudentAccount(title)) {
                    student.printABookByTitleFromStudentAccount(title);
                }else{
                    System.out.println("Book does not exit");
                }
            }
        }
    }

    /**
     * Searches available librarian catalogues from each student account by author.
     *
     * @param author the author to search for
     */
    public void findBookByAuthorFromStudentAccount(String author){
        for (Librarian librarian: listOfLibrarians) {
            for (Student student : listOfStudents) {
                student.getAllBooksFromUserTransactions((ArrayList<Book>)
                        librarian.getListOfBooks());
                if (student.findBookByAuthorFromStudentAccount(author)) {
                    student.printABookByAuthorFromStudentAccount(author);
                }else{
                    System.out.println("Book does not exit");
                }
            }
        }
    }

    /**
     * Requests a book borrow action for every registered student.
     *
     * @param title the title of the book to borrow
     */
    public void studentBorrowBook(String title){
        for (Student student : listOfStudents) {
            student.borrowBook(title);
        }
    }

    /**
     * Requests a book return action for every registered student.
     *
     * @param ISBN the ISBN of the returned book
     * @param name the author name
     * @param title the title of the returned book
     */
    public void studentReturnBook(int ISBN, String name, String title){
        for (Student student : listOfStudents) {
            student.returnBook(ISBN, name, title);
        }
    }
}
