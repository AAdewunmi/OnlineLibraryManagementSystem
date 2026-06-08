package com.librarymanagementsystem.transactions;

/**
 * Defines common catalogue search operations for book collections.
 */
public interface Search {

    /**
     * Searches for a book by author name.
     *
     * @param author the author name to search for
     * @return true when a matching book exists; otherwise false
     */
    public boolean searchByAuthor(String author);

    /**
     * Searches for a book by title.
     *
     * @param title the title to search for
     * @return true when a matching book exists; otherwise false
     */
    public boolean searchByTitle(String title);

    /**
     * Searches for a book by ISBN.
     *
     * @param ISBN the ISBN to search for
     * @return true when a matching book exists; otherwise false
     */
    public boolean searchByISBN(int ISBN);

}
