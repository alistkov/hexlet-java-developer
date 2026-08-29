package hexlet.oop.basics;

public class Circle implements Geometric {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getSquare() {
        var square = Math.PI * radius * radius;
        return square;
    }

    public String getName() {
        return "circle";
    }
}