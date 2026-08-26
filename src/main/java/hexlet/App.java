package hexlet;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String[] names = {"John", "Smit", "Karl"};
        var namesWithPrefix = ArraysTrack.addPrefix(names, "Mr.");
        System.out.println(Arrays.toString(namesWithPrefix));
        // => ["Mr. John", "Mr. Smit", "Mr. Karl"]

        System.out.println(Arrays.toString(names)); // Исходный массив не меняется
        // => ["John", "Smit", "Karl"]
    }
}
