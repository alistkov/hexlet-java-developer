package hexlet;

import hexlet.functions.Exercise;
import hexlet.functions.model.Book;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var books = new ArrayList<>(
                List.of(
                        new Book("Dubliners", "James Joyce"),
                        new Book("Moby-Dick", "Herman Melville"),
                        new Book("The Great Gatsby", "F. Scott Fitzgerald")
                )
        );

        var sortedBooks = Exercise.sortBooks(books);
        System.out.println(sortedBooks);
    }
}
