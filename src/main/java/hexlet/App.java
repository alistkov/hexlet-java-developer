package hexlet;

import hexlet.streams.Exercise;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var fruits = List.of("lemon", "apple", "banana");
        var result = Exercise.sortWords(fruits);
        System.out.println(result); // => [apple, banana, lemon]
    }
}
