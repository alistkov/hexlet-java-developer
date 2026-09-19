package hexlet;

import hexlet.lists.Exercises;
import hexlet.lists.model.Book;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var books =
                List.of(
                        new Book("Death on the Nile", "Agatha Christie", "Detective"),
                        new Book("Murder on the Orient Express", "Agatha Christie", "Detective"),
                        new Book("The Raven", "Edgar Allan Poe", "Poem"));

        System.out.println(Exercises.countBooks(books, "Agatha Christie", "Detective")); // 2
    }
}
