package com.librarymanagementsystem.library;

/**
 * @author Adrian Adewunmi
 * @date 19/01/2022
 * Represents a library branch with a name and address.
 */
public class Library {
    private final String LibraryName;
    private final String LibraryAddress;

    /**
     * Creates a library with the supplied name and address.
     *
     * @param LibraryName the display name of the library
     * @param LibraryAddress the library address
     */
    public Library(String LibraryName, String LibraryAddress){
        this.LibraryName = LibraryName;
        this.LibraryAddress = LibraryAddress;
    }

    /**
     * Gets the library name.
     *
     * @return the library name
     */
    public String getLibraryName(){
        return LibraryName;
    }

    /**
     * Gets the library address.
     *
     * @return the library address
     */
    public String getLibraryAddress(){
        return LibraryAddress;
    }

    /**
     * Formats the library details for console output.
     *
     * @return the library name and address
     */
    @Override
    public String toString() {
        return "Library Name: " + LibraryName + "\n" +
                "Library Address: " + LibraryAddress + "\n";
    }
}
