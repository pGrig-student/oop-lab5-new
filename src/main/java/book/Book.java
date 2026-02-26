package book;

import java.io.Serializable;

public class Book implements Serializable {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int pageCount;
    private double price;

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
