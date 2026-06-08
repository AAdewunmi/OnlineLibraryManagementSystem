package com.librarymanagementsystem.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests that Library stores and returns its branch details.
 */
class LibraryTest {

    /**
     * Verifies that a library stores its name and address.
     */
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
