package hexlet;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] numbers1 = {};
        ArraysTrack.bubbleSort(numbers1);
        System.out.println(Arrays.toString(numbers1)); // => []

        int[] numbers2 = {3, 10, 4, 3};
        ArraysTrack.bubbleSort(numbers2);
        System.out.println(Arrays.toString(numbers2)); // => [3, 3, 4, 10]
    }
}
