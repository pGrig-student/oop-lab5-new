package printer;

import book.Book;

public class Printer {

    public static void printBooks(Book[] books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void printMenu() {
        System.out.print("""
                
                --- ГОЛОВНЕ МЕНЮ ---
                1. Знайти книги за автором
                2. Знайти книги за видавництвом
                3. Знайти книги (до року X та >= Y сторінок)
                4. Показати найдорожчі книги
                5. Показати всі книги
                6. Зберегти книги у JSON (text)
                7. Завантажити книги з JSON (text)
                8. Зберегти книги у бінарний файл
                9. Завантажити книги з бінарного файлу
                0. Вихід
                Введіть номер дії:\s""");
    }
}
