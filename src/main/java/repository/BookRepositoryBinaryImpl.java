package repository;

import book.Book;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;

public class BookRepositoryBinaryImpl implements BookRepository {
    @Override
    public void outputArray(Book[] t, File file) {
        try (var out = new ObjectOutputStream(Files.newOutputStream(file.toPath()))) {
            out.writeObject(t);
            System.out.println("Дані успішно збережено у бінарний файл!");
        } catch (IOException ex) {
            System.out.println("Помилка запису файлу: " + ex.getMessage());
        }
    }

    @Override
    public void outputArray(Book[] t, String fileName) {
        outputArray(t, new File(fileName));
    }

    @Override
    public Book[] readArray(File file) {
        try (var in = new ObjectInputStream(Files.newInputStream(file.toPath()))) {
            return (Book[]) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Помилка запису файлу: " + e.getMessage());
            return new Book[0];
        }
    }

    @Override
    public Book[] readArray(String fileName) {
        return readArray(new File(fileName));
    }
}
