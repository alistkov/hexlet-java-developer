package hexlet;

import hexlet.oop.basics.OopBasics;

public class App {
    public static void main(String[] args) {
        System.out.println(OopBasics.hasDuplicates(new String[] {"java", "javascript", "php", "java"})); // true
        System.out.println(OopBasics.hasDuplicates(new String[] {"java", "javascript", "php", "perl"})); // false
    }
}
