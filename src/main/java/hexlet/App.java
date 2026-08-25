package hexlet;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("Hexlet Java Developer");

        System.out.println(Arrays.toString(ArraysTrack.getWeekends("short")));
        System.out.println(Arrays.toString(ArraysTrack.getWeekends("long")));
        System.out.println(Arrays.toString(ArraysTrack.getWeekends("a")));
    }
}
