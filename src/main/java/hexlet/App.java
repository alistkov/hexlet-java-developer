package hexlet;

public class App {
    public static void main(String[] args) {
        int[] numbers1 = {1, 4, 3, 4, 5};
        System.out.println(ArraysTrack.mult(numbers1)); // 240

        int[] numbers2 = {1, 4, -3, 2};
        System.out.println(ArraysTrack.mult(numbers2)); // -24

        int[] numbers3 = {1, -3, 5, 4, -3, 0};
        System.out.println(ArraysTrack.mult(numbers3)); // 0
    }
}
