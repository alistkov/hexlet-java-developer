package hexlet;

import hexlet.generics.Exercise;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var numbers = new ArrayList<>(List.of(2, 3, 5));

        var result = Exercise.duplicate(numbers);

        System.out.println(result); // => [4, 6, 10]
    }
}
