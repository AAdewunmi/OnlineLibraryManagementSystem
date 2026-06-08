package com.librarymanagementsystem.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests the Book model's stored details and borrowed status changes.
 */
class BookTest {

    /**
     * Verifies that a book stores its ISBN, author, and title.
     */
    @Test
    void shouldCreateBook() {

        Book book =
                new Book(1001,
                        "James Gosling",
                        "Java");

        assertEquals(1001, book.getISBN());
        assertEquals("James Gosling", book.getAuthor());
        assertEquals("Java", book.getBookTitle());
    }

    /**
     * Verifies that a new book starts as available.
     */
    @Test
    void shouldBeNotBorrowedInitially() {

        Book book =
                new Book(1001,"Author","Title");

        assertFalse(book.isBorrowed());
    }

    /**
     * Verifies that borrowing a book marks it as borrowed.
     */
    @Test
    void shouldMarkBookBorrowed() {

        Book book =
                new Book(1001,"Author","Title");

        book.borrowed();

        assertTrue(book.isBorrowed());
    }

    /**
     * Verifies that returning a borrowed book marks it as available.
     */
    @Test
    void shouldMarkBookReturned() {

        Book book =
                new Book(1001,"Author","Title");

        book.borrowed();
        book.returned();

        assertFalse(book.isBorrowed());
    }
}
