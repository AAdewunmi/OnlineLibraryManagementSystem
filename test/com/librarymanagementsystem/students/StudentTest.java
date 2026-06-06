package com.librarymanagementsystem.students;

import com.librarymanagementsystem.book.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;

    @BeforeEach
    void setup() {

        student =
                new Student(
                        "Sai",
                        1,
                        "sai@test.com",
                        "sai",
                        "pass");

        ArrayList<Book> books =
                new ArrayList<>();

        books.add(
                new Book(
                        100,
                        "James",
                        "Java"));

        books.add(
                new Book(
                        101,
                        "Martin",
                        "Clean Code"));

        student.getAllBooksFromUserTransactions(
                books);
    }

    @Test
    void shouldFindBookByISBN() {

        assertTrue(
                student.findBookByISBNFromStudentAccount(
                        100));
    }

    @Test
    void shouldNotFindBookByISBN() {

        assertFalse(
                student.findBookByISBNFromStudentAccount(
                        999));
    }

    @Test
    void shouldFindBookByTitle() {

        assertTrue(
                student.findBookByTitleFromStudentAccount(
                        "Java"));
    }

    @Test
    void shouldFindBookByAuthor() {

        assertTrue(
                student.findBookByAuthorFromStudentAccount(
                        "James"));
    }

    @Test
    void shouldStoreStudentDetails() {

        assertEquals(
                "Sai",
                student.getName());

        assertEquals(
                1,
                student.getStudentId());
    }
}