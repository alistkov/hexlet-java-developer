package hexlet;

import hexlet.lists.Exercises;

public class App {
    public static void main(String[] args) {
        System.out.println(Exercises.isBracketsBalanced("()")); // true
        System.out.println(Exercises.isBracketsBalanced("()()")); // true
        System.out.println(Exercises.isBracketsBalanced("(()())")); // true

        System.out.println(Exercises.isBracketsBalanced("(")); // false
        System.out.println(Exercises.isBracketsBalanced("(()")); // false
        System.out.println(Exercises.isBracketsBalanced(")(")); // false
    }
}
