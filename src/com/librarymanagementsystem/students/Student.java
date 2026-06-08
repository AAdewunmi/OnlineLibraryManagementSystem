package com.librarymanagementsystem.students;

import com.librarymanagementsystem.book.Book;
import com.librarymanagementsystem.transactions.UserTransactions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adrian Adewunmi
 * @date 06/01/2020
 * Represents a student account that can search, borrow, and return books from
 * a copied catalogue.
 */
public class Student extends UserTransactions {

    private final String name;
    private final int studentId;
    private final String email;
    private final String studentUsername;
    private final String studentPassword;
    private List<Book> listOfBooks;


    /**
     * Creates a student profile with login details.
     *
     * @param name student name
     * @param studentId student id
     * @param email student email
     * @param studentUsername student login username
     * @param studentPassword student login password
     */

    public Student(String name, int studentId, String email,
                   String studentUsername, String studentPassword) {
        this.name = name;
        this.studentId = studentId;
        this.email = email;
        this.studentUsername = studentUsername;
        this.studentPassword = studentPassword;
    }

    /**
     * Gets the student name.
     *
     * @return the student name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the student id.
     *
     * @return the student id
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * Gets the student email address.
     *
     * @return the student email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gets the student login username.
     *
     * @return the student username
     */
    public String getStudentUsername() {
        return studentUsername;
    }

    /**
     * Gets the student login password.
     *
     * @return the student password
     */
    public String getStudentPassword() {
        return studentPassword;
    }

    /**
     * Formats the student details for console output.
     *
     * @return the student name, id, and email address
     */
    @Override
    public String toString() {
        return "Student Name: " + name + "\n"
                + "Student ID: " + studentId + "\n"
                + "Email: " + email + "\n";
    }

    /**
     * Copies a shared catalogue into the student account.
     *
     * @param list the list of books created by a librarian
     */
    public void getAllBooksFromUserTransactions(ArrayList<Book> list){
        this.listOfBooks = (List<Book>) list.clone();
    }

    /**
     * Searches the student catalogue by ISBN.
     *
     * @param isbn the book ISBN
     * @return true when a matching book is found; otherwise false
     */
    public boolean findBookByISBNFromStudentAccount(int isbn) {
        for (Book book : listOfBooks) {
            if (book.getISBN() == isbn) {
                return true;
            }
        }
        return false;
    }

    /**
     * Prints a book from the student catalogue by ISBN.
     *
     * @param isbn the book ISBN
     */
    public void printABookFromStudentAccount(int isbn) {
        for (Book book : listOfBooks) {
            if (book.getISBN() == isbn) {
                System.out.println(book);
            }
        }
    }

    /**
     * Searches the student catalogue by title.
     *
     * @param title the book title
     * @return true when a matching book is found; otherwise false
     */

    public boolean findBookByTitleFromStudentAccount(String title) {
        for (Book book : listOfBooks) {
            if (book.getBookTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Prints a book from the student catalogue by title.
     *
     * @param title the book title
     */
    public void printABookByTitleFromStudentAccount(String title) {
        for (Book book : listOfBooks) {
            if (book.getBookTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
            }
        }
    }

    /**
     * Searches the student catalogue by author.
     *
     * @param author the book author
     * @return true when a matching book is found; otherwise false
     */
    public boolean findBookByAuthorFromStudentAccount(String author) {
        for (Book book : listOfBooks) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Prints a book from the student catalogue by author.
     *
     * @param author the book author
     */
    public void printABookByAuthorFromStudentAccount(String author) {
        for (Book book : listOfBooks) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book);
            }
        }
    }

    /**
     * Adds a returned book back into the student catalogue.
     *
     * @param ISBN the ISBN of the book
     * @param name the author name
     * @param title the book title
     */
    public void addBookFromStudentAccount(int ISBN, String name, String title){
        Book book = new Book(ISBN, name, title);
        listOfBooks.add(book);
    }

    /**
     * Removes a book title from the student catalogue.
     *
     * @param title the title of the book to remove
     */
    public void removeBookFromStudentAccount(String title){
        listOfBooks.removeIf(book1 -> book1.getBookTitle().equalsIgnoreCase(title));
    }

    /**
     * Borrows a book by title when it exists and is available.
     *
     * @param title the title of the book to borrow
     */
    public void borrowBook(String title){
        for (Book book : listOfBooks) {
            if (book.getBookTitle().equals(title)) {
                if (!(book.isBorrowed())) {
                    book.borrowed();
                    System.out.println("You have successfully borrowed " + title);
                    removeBookFromStudentAccount(title);
                    System.out.println("\n***List Of Books After Book Borrowed!***\n");
                    printListOfBooksFromStudentAccount();
                    return;
                }
            }
            if(!(book.getBookTitle().equals(title))){
                System.out.println("Sorry, this book is already borrowed!");
                return;
            }
        }
        System.out.println("Book not found in catalog!");
    }

    /**
     * Returns a book to the student catalogue.
     *
     * @param ISBN the ISBN of the returned book
     * @param name the author name
     * @param title the title of the returned book
     */
    public void returnBook(int ISBN, String name, String title){
        for (Book book : listOfBooks) {
            removeBookFromStudentAccount(title);
            if (!(book.getBookTitle().equals(title))){
                if (!(book.isBorrowed())) {
                    book.returned();
                    addBookFromStudentAccount(ISBN, name, title);
                    System.out.println("Book returned: " + title);
                    System.out.println("\n***List Of Books After Book Returned!***\n");
                    printListOfBooksFromStudentAccount();
                    return;
                }
            }
        }
    }

    /**
     * Prints all books currently visible in the student account.
     */
    public void printListOfBooksFromStudentAccount(){
        for (Book book : listOfBooks) {
            System.out.println(book);
        }
    }
}
