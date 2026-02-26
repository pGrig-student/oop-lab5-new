package book;

import java.io.Serializable;

public class Book implements Serializable {
    private final int id;
    private final String title;
    private final String author;
    private final String publisher;
    private final int year;
    private final int pageCount;
    private final double price;

    public Book(int id, String title, String author, String publisher, int year, int pageCount, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pageCount = pageCount;
        this.price = price;
    }


    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {return price;}

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", Назва='" + title + '\'' +
                ", Автор='" + author + '\'' +
                ", Видавництво='" + publisher + '\'' +
                ", Рік=" + year +
                ", Сторінок=" + pageCount +
                ", Ціна=" + price +
                '}';
    }
}
