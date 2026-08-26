package hexlet;

public class App {
    public static void main(String[] args) {
        // Общие уникальные элементы: 1, 3, 2
        System.out.println(ArraysTrack.getSameCount(new int[] {1, 3, 2, 2}, new int[] {3, 1, 1, 2, 5})); // 3

// Общие уникальные элементы: 4
        System.out.println(ArraysTrack.getSameCount(new int[] {1, 4, 4}, new int[] {4, 8, 4})); // 1

// Общие уникальные элементы: 1, 10
        System.out.println(ArraysTrack.getSameCount(new int[] {1, 10, 3}, new int[] {10, 100, 35, 1})); // 2

// Нет элементов
        System.out.println(ArraysTrack.getSameCount(new int[] {}, new int[] {})); // 0
    }
}
