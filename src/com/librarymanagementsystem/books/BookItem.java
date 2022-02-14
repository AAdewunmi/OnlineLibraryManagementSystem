package com.librarymanagementsystem.books;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

/**
 * @author Adrian Adewunmi
 * @date 19/01/2022
 * This class is used to represent a book item
 * because there could be multiple copies of a book.
 */
public class BookItem extends Book{

    private final BookFormat bookFormat;
    private final BookStatus bookStatus;

    public BookItem(String ISBN, String author, String bookTitle, String publisher, String edition, String subject, int numberOfPages, String publicationDate,
                    double bookPrice, String purchaseDate, String bookShelfId, int bookQuantity, BookFormat bookFormat, BookStatus bookStatus) {
        super(ISBN, author, bookTitle, publisher, edition, subject, numberOfPages, publicationDate, bookPrice, purchaseDate, bookQuantity);
        this.bookFormat = bookFormat;
        this.bookStatus = bookStatus;
    }

    public BookItem(String ISBN, String author, String bookTitle, int bookQuantity) {
        super(ISBN, author, bookTitle, bookQuantity);
        this.bookFormat = BookFormat.Hardcover;
        this.bookStatus = BookStatus.Unknown;
    }

    public BookFormat getBookFormat() {
        return bookFormat;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void bookStatus(){
        switch (bookStatus){
            case Available:
                System.out.println("Book is available");
                break;
            case Reserved:
                System.out.println("Book is reserved");
                break;
            case Borrowed:
                System.out.println("Book is borrowed");
                break;
            case Lost:
                System.out.println("Book is lost");
                break;
            case Damaged:
                System.out.println("Book is damaged");
                break;
            case Unknown:
                System.out.println("Book status is unknown");
                break;
        }
    }

    public void bookFormat(){
        switch (bookFormat){
            case Hardcover:
                System.out.println("Book is hardcover");
                break;
            case Paperback:
                System.out.println("Book is paperback");
                break;
            case Audiobook:
                System.out.println("Book is audiobook");
                break;
            case Ebook:
                System.out.println("Book is ebook");
                break;
            case Newspaper:
                System.out.println("Book is newspaper");
                break;
            case Magazine:
                System.out.println("Book status is magazine");
                break;
            case Journal:
                System.out.println("Book status is journal");
                break;
        }
    }

    public Date bookBorrowedDate(){
        Date date = new Date();
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();
        formatter.format("%tc", calendar, calendar, calendar, calendar, calendar, calendar);
        calendar.setTime(date);
        System.out.println("Book borrowed date is: " + formatter);
        return calendar.getTime();
    }

    public Date bookReturnedDate(){
        Date date = new Date();
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.roll(Calendar.DAY_OF_MONTH, 14);
        calendar.getTime().toString();
        formatter.format("%tc", calendar, calendar, calendar, calendar, calendar, calendar);
        System.out.println("Book return date is: " + formatter);
        return calendar.getTime();
    }

    public long bookBorrowedDays(){
        Date date1 = bookBorrowedDate();
        Date date2 = bookReturnedDate();
        long daysBetween = ChronoUnit.DAYS.between(date1.toInstant(), date2.toInstant());
        System.out.println("Book borrowed days is: " + daysBetween);
        return daysBetween;
    }

}
