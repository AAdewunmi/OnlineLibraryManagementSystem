package com.librarymanagementsystem.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

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

    @Test
    void shouldBeNotBorrowedInitially() {

        Book book =
                new Book(1001,"Author","Title");

        assertFalse(book.isBorrowed());
    }

    @Test
    void shouldMarkBookBorrowed() {

        Book book =
                new Book(1001,"Author","Title");

        book.borrowed();

        assertTrue(book.isBorrowed());
    }

    @Test
    void shouldMarkBookReturned() {

        Book book =
                new Book(1001,"Author","Title");

        book.borrowed();
        book.returned();

        assertFalse(book.isBorrowed());
    }
}