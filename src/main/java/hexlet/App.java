package hexlet;

import hexlet.oop.basics.Circle;
import hexlet.oop.basics.OopBasics;

public class App {
    public static void main(String[] args) {
        var circle = new Circle(1, 2,5);
        System.out.println(OopBasics.getCircumference(circle)); // Приблизительно 31.4
    }
}
