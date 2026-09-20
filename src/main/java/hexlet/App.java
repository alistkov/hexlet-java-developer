package hexlet;

import hexlet.functions.Exercise;

public class App {
    public static void main(String[] args) {
        System.out.println(Exercise.average(10)); // 10.0
        System.out.println(Exercise.average(0, 10)); // 5.0
        System.out.println(Exercise.average(-3, 4, 2, 10)); // 3.25
    }
}
