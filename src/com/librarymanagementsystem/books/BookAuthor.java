package com.librarymanagementsystem.books;
/**
 * @author Adrian Adewunmi
 * @date 06/01/2022
 * This class is used to create a book author object
 */
public class BookAuthor {
    private final String authorName;
    private final String authorBookTitle;

    public BookAuthor(String authorName, String authorBookTitle) {
        this.authorName = authorName;
        this.authorBookTitle = authorBookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorBookTitle() {
        return authorBookTitle;
    }
}
