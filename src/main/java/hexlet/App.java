package hexlet;

import hexlet.functions.Exercise;

import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        var coll = List.of(1, 2, 3, 4, 5, 6);
        var actual = Exercise.countNumbers(coll);
        var expected = Map.of(
                "positive", 2,
                "negative", 1,
                "zero", 3
        );
    }
}
