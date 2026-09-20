package hexlet;

import hexlet.functions.Exercise;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        var products = Map.of(
                "Apple", 5,
                "Lemon", 9,
                "Pear", 15
        );

        Exercise.printBalance(products, 10);
    }
}
