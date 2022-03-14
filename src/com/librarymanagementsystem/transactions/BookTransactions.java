package com.librarymanagementsystem.transactions;

import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

/**
 * @author Adrian Adewunmi
 * @date 19/01/2022
 * This class is used to record book borrowing transactions.
 */
public class BookTransactions {

    // Check book status
    public void checkBookStatus(String bookId) {
        if (bookId.equals("")) {
            System.out.println("Book status is: " + "Book is not available");
        } else {
            System.out.println("Book status is: " + "Book is available");
        }
    }

    // Reserved date
    public Date reservedDate() {
        return new Date();
    }

    // Book borrowed date
    public Date bookBorrowedDate() {
        Date date = new Date();
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();
        formatter.format("%tc", calendar, calendar, calendar, calendar, calendar, calendar);
        System.out.println("Book borrowed date is: " + formatter);
        return calendar.getTime();
    }

    // Book returned date
    public Date bookReturnedDate() {
        Date date = new Date();
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 14);
        calendar.getTime().toString();
        formatter.format("%tc", calendar, calendar, calendar, calendar, calendar, calendar);
        System.out.println("Book returned date is: " + formatter);
        return calendar.getTime();
    }

    // Days borrowed
    public long bookBorrowedDays() {
        Date date1 = bookBorrowedDate();
        Date date2 = bookReturnedDate();
        long daysBetween = ChronoUnit.DAYS.between(date2.toInstant(), date1.toInstant());
        System.out.println("Book borrowed days is: " + daysBetween);
        return daysBetween;
    }

    // Reserve a book
    public void reserveBook() {

    }

    // Borrow a book
    public void borrowBook() {

    }

    // Renew a book
    public void renewBook() {

    }

    // Return a book
    public void returnBook() {

    }


}
