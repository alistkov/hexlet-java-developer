package hexlet;

import hexlet.oop.basics.Circle;
import hexlet.oop.basics.Geometric;
import hexlet.oop.basics.OopBasics;
import hexlet.oop.basics.Quadrate;

public class App {
    public static void main(String[] args) {
        Geometric quadrate = new Quadrate(5);
        System.out.println(OopBasics.getFigureSquare(quadrate)); // "Square of quadrate is 25.0"
        Geometric circle = new Circle(10);
        System.out.println(OopBasics.getFigureSquare(circle)); // "Square of circle is 314.15..."
    }
}
