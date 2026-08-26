package hexlet;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] numbers1 = {10, 11, 24};
        int[] numbers2 = {10, 13, 14, 18, 24, 30};
        var result1 = ArraysTrack.getIntersectionOfSortedArrays(numbers1, numbers2);
        System.out.println(Arrays.toString(result1)); // => [10, 24]

        int[] numbers3 = {10, 11, 24};
        int[] numbers4 = {-2, 3, 4};
        var result2 = ArraysTrack.getIntersectionOfSortedArrays(numbers3, numbers4);
        System.out.println(Arrays.toString(result2)); // => []

        int[] numbers5 = {10, 10, 13, 14, 18, 24, 24, 30};
        int[] numbers6 = {10, 10, 11, 24, 24};
        int[] result3 = ArraysTrack.getIntersectionOfSortedArrays(numbers5, numbers6);
        System.out.println(Arrays.toString(result3)); // => {10, 24};
    }
}
