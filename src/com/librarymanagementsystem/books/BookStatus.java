package com.librarymanagementsystem.books;

/**
 * @author Adrian Adewunmi
 * @date 16/02/2022
 * This class is used to define the status of a book
 */

public enum BookStatus {
    Available,
    Reserved,
    Borrowed,
    Returned,
    Lost,
    Damaged,
    Unknown
}
