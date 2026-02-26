package controller;

import book.Book;
import printer.Printer;
import repository.BookRepository;
import repository.BookRepositoryBinaryImpl;
import repository.BookRepositoryTextImpl;
import service.Service;

import java.util.Scanner;

public class BookController {
    private Book[] books;
    private final BookRepository textRepo;
    private final BookRepository binaryRepo;
    private final Scanner scanner;

    public BookController(Book[] initialBooks) {
        this.books = initialBooks;
        this.textRepo = new BookRepositoryTextImpl();
        this.binaryRepo = new BookRepositoryBinaryImpl();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean isRunning = true;

        while (isRunning) {
            Printer.printMenu();

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Введіть ім'я або частину імені автора: ");
                        String author = scanner.nextLine();
                        Book[] booksByAuthor = Service.getBooksByAuthor(books, author);
                        Printer.printBooks(booksByAuthor);
                        break;
                    case 2:
                        System.out.print("Введіть назву або частину назви видавництва: ");
                        String publisher = scanner.nextLine();
                        Book[] bookByPublisher = Service.getBooksByPublisher(books, publisher);
                        Printer.printBooks(bookByPublisher);
                        break;
                    case 3:
                        System.out.print("Введіть граничний рік (до якого року): ");
                        int year = scanner.nextInt();
                        System.out.print("Введіть мінімальну к-сть сторінок: ");
                        int pages = scanner.nextInt();
                        Book[] booksByYearAndPages = Service.getBooksByYearAndPages(books, year, pages);
                        Printer.printBooks(booksByYearAndPages);
                        break;
                    case 4:
                        System.out.println("Список найдорожчих книг:");
                        Book[] booksByMostExpensiveBooks = Service.getMostExpensiveBooks(books);
                        Printer.printBooks(booksByMostExpensiveBooks);
                        break;
                    case 5:
                        Printer.printBooks(books);
                        break;
                    case 6:
                        textRepo.outputArray(books, "books.json");
                        break;
                    case 7:
                        books = textRepo.readArray("books.json");
                        System.out.println("Дані успішно завантажено з JSON.");
                        break;
                    case 8:
                        binaryRepo.outputArray(books, "books.bin");
                        break;
                    case 9:
                        books = binaryRepo.readArray("books.bin");
                        System.out.println("Дані успішно завантажено з бінарного файлу.");
                        break;
                    case 0:
                        System.out.println("Роботу завершено.");
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Невірний вибір. Спробуйте ще раз.");
                }
            } else {
                System.out.println("Будь ласка, введіть число.");
                scanner.next();
            }
        }
        scanner.close();
    }
}