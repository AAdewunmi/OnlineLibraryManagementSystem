package com.librarymanagementsystem.transactions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTransactionsTest {

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

    @Test
    void shouldFindBookByISBN() {

        UserTransactions ut =
                new UserTransactions();

        ut.addBook(1,"James","Java");

        assertTrue(
                ut.searchByISBN(1));
    }

    @Test
    void shouldNotFindMissingISBN() {

        UserTransactions ut =
                new UserTransactions();

        assertFalse(
                ut.searchByISBN(99));
    }

    @Test
    void shouldFindBookByTitle() {

        UserTransactions ut =
                new UserTransactions();

        ut.addBook(1,"James","Java");

        assertTrue(
                ut.searchByTitle("Java"));
    }

    @Test
    void shouldFindBookByAuthor() {

        UserTransactions ut =
                new UserTransactions();

        ut.addBook(1,"James","Java");

        assertTrue(
                ut.searchByAuthor("James"));
    }
}