package service;

import book.Book;

import java.util.Arrays;

public class Service {
    public static Book[] getMostExpensiveBooks(Book[] books) {
        double maxPrice = 0;
        for (Book value : books) {
            if (value.getPrice() > maxPrice) {
                maxPrice = value.getPrice();
            }
        }
        int count = 0;
        Book[] mostExpensiveBooks = new Book[books.length];
        for (Book book : books) {
            if (book.getPrice() == maxPrice) {
                mostExpensiveBooks[count] = book;
                count++;
            }
        }
        return Arrays.copyOf(mostExpensiveBooks, count);
    }

    public static Book[] getBooksByAuthor(Book[] books, String author) {
        int counter = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(author)) {
                books[counter] = books[i];
                counter++;
            }
        }
        return Arrays.copyOf(books, counter);
    }

    public static Book[] getBooksByPublisher(Book[] books, String publisher) {
        int counter = 0;
        Book[] books2 = new Book[books.length];
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                books2[counter] = book;
                counter++;
            }
        }
        return Arrays.copyOf(books2, counter);
    }

    public static Book[] getBooksByYearAndPages(Book[] books, int year, int pages) {
        int count = 0;
        Book[] booksByYearAndPages = new Book[books.length];
        for (Book book : books) {
            if (book.getYear() < year && book.getPageCount() > pages) {
                booksByYearAndPages[count] = book;
                count++;
            }
        }
        return Arrays.copyOf(booksByYearAndPages, count);
    }
}
