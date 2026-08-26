package hexlet;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] numbers1 = {};
        System.out.println(Arrays.toString(ArraysTrack.getSameParity(numbers1))); // []

        int[] numbers2 = {1, 2, 3};
        System.out.println(Arrays.toString(ArraysTrack.getSameParity(numbers2))); // [1, 3]

        int[] numbers3 = {1, 2, 8};
        System.out.println(Arrays.toString(ArraysTrack.getSameParity(numbers3))); // [1]

        int[] numbers4 = {2, 2, 8};
        System.out.println(Arrays.toString(ArraysTrack.getSameParity(numbers4))); // [2, 2, 8]

        int[] numbers5 = {-3, 2, 1};
        System.out.println(Arrays.toString(ArraysTrack.getSameParity(numbers5))); // [-3, 1]
    }
}
