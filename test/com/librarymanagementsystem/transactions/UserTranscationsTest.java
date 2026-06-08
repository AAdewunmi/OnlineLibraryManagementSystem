package com.librarymanagementsystem.transactions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests book catalogue operations provided by UserTransactions.
 */
class UserTransactionsTest {

    /**
     * Verifies that a book can be added to the catalogue.
     */
    @Test
    void shouldAddBook() {

        UserTransactions ut =
                new UserTransactions();

        ut.addBook(
                1,
                "James",
                "Java");

        assertEquals(
                1,
                ut.getListOfBooks().size());
    }

    /**
     * Verifies that a book can be removed from the catalogue by ISBN.
     */
    @Test
    void shouldRemoveBook() {

        UserTransactions ut =
                new UserTransactions();

        ut.addBook(1,"James","Java");

        ut.removeBook(1);

        assertEquals(
                0,
                ut.getListOfBooks().size());
    }

    /**
     * Verifies that an existing ISBN can be found.
     */
    @Test
    void shouldFindBookByISBN() {

        UserTransactions ut =
                new UserTransactions();

        ut.addBook(1,"James","Java");

        assertTrue(
                ut.searchByISBN(1));
    }

    /**
     * Verifies that a missing ISBN is not found.
     */
    @Test
    void shouldNotFindMissingISBN() {

        UserTransactions ut =
                new UserTransactions();

        assertFalse(
                ut.searchByISBN(99));
    }

    /**
     * Verifies that an existing title can be found.
     */
    @Test
    void shouldFindBookByTitle() {

        UserTransactions ut =
                new UserTransactions();

        ut.addBook(1,"James","Java");

        assertTrue(
                ut.searchByTitle("Java"));
    }

    /**
     * Verifies that an existing author can be found.
     */
    @Test
    void shouldFindBookByAuthor() {

        UserTransactions ut =
                new UserTransactions();

        ut.addBook(1,"James","Java");

        assertTrue(
                ut.searchByAuthor("James"));
    }
}
