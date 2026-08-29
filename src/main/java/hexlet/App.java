package hexlet;

import hexlet.oop.basics.OopBasics;

public class App {
    public static void main(String[] args) {
        System.out.println(OopBasics.calculateAverage(new Integer[] {1, 2, 3, 4})); // 2.5
        System.out.println(OopBasics.calculateAverage(new Integer[] {})); // null
        System.out.println(OopBasics.calculateAverage(new Integer[] {null})); // null
        System.out.println(OopBasics.calculateAverage(new Integer[] {1, null, 3})); // null
    }
}
