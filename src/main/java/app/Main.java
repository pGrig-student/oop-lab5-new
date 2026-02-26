package app;

import book.Book;
import controller.BookController;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book(1, "Кобзар", "Шевченко Т.Г.", "Дніпро", 1985, 400, 150.00);
        books[1] = new Book(2, "Тіні забутих предків", "Коцюбинський М.М.", "А-ба-ба-га-ла-ма-га", 2015, 120, 200.50);
        books[2] = new Book(3, "Захар Беркут", "Франко І.Я.", "Дніпро", 1990, 250, 80.00);
        books[3] = new Book(4, "Гайдамаки", "Шевченко Т.Г.", "Основа", 2005, 180, 120.00);
        books[4] = new Book(5, "Java. Ефективне програмування", "Джошуа Блох", "Addison-Wesley", 2019, 450, 1200.00);

        BookController controller = new BookController(books);

        controller.start();
    }
}