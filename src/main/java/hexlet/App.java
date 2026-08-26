package hexlet;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] numbers1 = {3};
        ArraysTrack.swap(numbers1);
        System.out.println(Arrays.toString(numbers1)); // => [3]

        int[] numbers2 = {1, 2, 3, 4};
        ArraysTrack.swap(numbers2);
        System.out.println(Arrays.toString(numbers2)); // => [4, 2, 3, 1]
    }
}
