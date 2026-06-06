package com.librarymanagementsystem.administrator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministratorTest {

    @Test
    void adminLoginSuccess() {

        Administrator admin =
                new Administrator();

        assertTrue(
                admin.adminLogin(
                        "admin",
                        "admin"));
    }

    @Test
    void adminLoginFailure() {

        Administrator admin =
                new Administrator();

        assertFalse(
                admin.adminLogin(
                        "wrong",
                        "wrong"));
    }

    @Test
    void shouldCreateStudent() {

        Administrator admin =
                new Administrator();

        admin.createStudent(
                "Sai",
                1,
                "s@test.com",
                "sai",
                "123");

        assertTrue(
                admin.searchStudent(1));
    }

    @Test
    void shouldRemoveStudent() {

        Administrator admin =
                new Administrator();

        admin.createStudent(
                "Sai",
                1,
                "s@test.com",
                "sai",
                "123");

        assertTrue(
                admin.removeStudent(1));

        assertFalse(
                admin.searchStudent(1));
    }

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

    @Test
    void studentLoginSuccess() {

        Administrator admin =
                new Administrator();

        admin.createStudent(
                "Sai",
                1,
                "s@test.com",
                "sai",
                "123");

        assertTrue(
                admin.studentLogin(
                        "sai",
                        "123"));
    }
}