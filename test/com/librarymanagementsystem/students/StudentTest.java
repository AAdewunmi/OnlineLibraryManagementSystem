package com.librarymanagementsystem.students;

import com.librarymanagementsystem.book.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests student profile details and catalogue search behavior.
 */
class StudentTest {

    Student student;

    /**
     * Builds a student with a copied catalogue before each test.
     */
    @BeforeEach
    void setup() {

        student =
                new Student(
                        "James",
                        1,
                        "j@test.com",
                        "james",
                        "pass");

        ArrayList<Book> books =
                new ArrayList<>();

        books.add(
                new Book(
                        100,
                        "Mark",
                        "Java"));

        books.add(
                new Book(
                        101,
                        "Martin",
                        "Clean Code"));

        student.getAllBooksFromUserTransactions(
                books);
    }

    /**
     * Verifies that a student can find a book by ISBN.
     */
    @Test
    void shouldFindBookByISBN() {

        assertTrue(
                student.findBookByISBNFromStudentAccount(
                        100));
    }

    /**
     * Verifies that a missing ISBN is not found.
     */
    @Test
    void shouldNotFindBookByISBN() {

        assertFalse(
                student.findBookByISBNFromStudentAccount(
                        999));
    }

    /**
     * Verifies that a student can find a book by title.
     */
    @Test
    void shouldFindBookByTitle() {

        assertTrue(
                student.findBookByTitleFromStudentAccount(
                        "Java"));
    }

    /**
     * Verifies that a student can find a book by author.
     */
    @Test
    void shouldFindBookByAuthor() {

        assertTrue(
                student.findBookByAuthorFromStudentAccount(
                        "Martin"));
    }

    /**
     * Verifies that student details are stored on creation.
     */
    @Test
    void shouldStoreStudentDetails() {

        assertEquals(
                "James",
                student.getName());

        assertEquals(
                1,
                student.getStudentId());
    }
}
