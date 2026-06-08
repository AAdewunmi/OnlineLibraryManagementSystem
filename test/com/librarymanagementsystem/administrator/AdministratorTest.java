package com.librarymanagementsystem.administrator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests administrator authentication and account management workflows.
 */
class AdministratorTest {

    /**
     * Verifies that the built-in administrator credentials are accepted.
     */
    @Test
    void adminLoginSuccess() {

        Administrator admin =
                new Administrator();

        assertTrue(
                admin.adminLogin(
                        "admin",
                        "admin"));
    }

    /**
     * Verifies that invalid administrator credentials are rejected.
     */
    @Test
    void adminLoginFailure() {

        Administrator admin =
                new Administrator();

        assertFalse(
                admin.adminLogin(
                        "wrong",
                        "wrong"));
    }

    /**
     * Verifies that an administrator can register a student.
     */
    @Test
    void shouldCreateStudent() {

        Administrator admin =
                new Administrator();

        admin.createStudent(
                "Bill",
                1,
                "b@test.com",
                "bill",
                "123");

        assertTrue(
                admin.searchStudent(1));
    }

    /**
     * Verifies that an administrator can remove a registered student.
     */
    @Test
    void shouldRemoveStudent() {

        Administrator admin =
                new Administrator();

        admin.createStudent(
                "Bill",
                1,
                "b@test.com",
                "bill",
                "123");

        assertTrue(
                admin.removeStudent(1));

        assertFalse(
                admin.searchStudent(1));
    }

    /**
     * Verifies that an administrator can register a librarian.
     */
    @Test
    void shouldCreateLibrarian() {

        Administrator admin =
                new Administrator();

        admin.createLibrarian(
                "John",
                10,
                "john@test.com",
                "john",
                "123");

        assertTrue(
                admin.searchLibrarian(10));
    }

    /**
     * Verifies that an administrator can remove a registered librarian.
     */
    @Test
    void shouldRemoveLibrarian() {

        Administrator admin =
                new Administrator();

        admin.createLibrarian(
                "John",
                10,
                "john@test.com",
                "john",
                "123");

        assertTrue(
                admin.removeLibrarian(10));

        assertFalse(
                admin.searchLibrarian(10));
    }

    /**
     * Verifies that a registered librarian can log in.
     */
    @Test
    void librarianLoginSuccess() {

        Administrator admin =
                new Administrator();

        admin.createLibrarian(
                "John",
                10,
                "john@test.com",
                "john",
                "123");

        assertTrue(
                admin.librarianLogin(
                        "john",
                        "123"));
    }

    /**
     * Verifies that a registered student can log in.
     */
    @Test
    void studentLoginSuccess() {

        Administrator admin =
                new Administrator();

        admin.createStudent(
                "Bill",
                1,
                "b@test.com",
                "bill",
                "123");

        assertTrue(
                admin.studentLogin(
                        "bill",
                        "123"));
    }
}
