package com.librarymanagementsystem.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void shouldCreateLibrary() {

        Library library =
                new Library(
                        "London Library",
                        "UK");

        assertEquals(
                "London Library",
                library.getLibraryName());

        assertEquals(
                "UK",
                library.getLibraryAddress());
    }
}