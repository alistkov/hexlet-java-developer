package hexlet;

import hexlet.lists.Exercises;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var items = List.of(1, -2, 3, -5);
        var result = Exercises.replaceByZero(items);
        System.out.println(result); // => [1, 0, 3, 0]
        // Исходный список не изменился
        System.out.println(items); // => [1, -2, 3, -5]
    }
}
