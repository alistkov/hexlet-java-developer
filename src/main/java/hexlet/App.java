package hexlet;

import hexlet.functions.Exercise;

public class App {
    public static void main(String[] args) {
        var sum = Exercise.calculate(2, 3, (a, b) -> a + b);
        System.out.println(sum);
    }
}
