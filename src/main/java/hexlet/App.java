package hexlet;

import hexlet.streams.Exercise;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var numbers = List.of(3, -5, 6, 1, 0, -2, 10);

        System.out.println(Exercise.getSecondBiggest(numbers)); // 6
        System.out.println(Exercise.getSecondBiggest(List.of()));
        System.out.println(Exercise.getSecondBiggest(List.of(2)));
    }
}
