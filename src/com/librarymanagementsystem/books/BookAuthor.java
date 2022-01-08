package com.librarymanagementsystem.books;
/**
 * @author Adrian Adewunmi
 * @date 08/01/2022
 * This class is used to create a book author object
 */
public class BookAuthor extends Book {
    private final String authorName;

    public BookAuthor(String ISBN, String bookTitle, String publisher, String edition, String subject, int numberOfPages, String authorName, String publicationDate) {
        super(ISBN, bookTitle, publisher, edition, subject, numberOfPages, publicationDate);
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }
    @Override
    public String toString() {
        return super.toString() +
            "Author: " + this.authorName + "\n";
    }

}
