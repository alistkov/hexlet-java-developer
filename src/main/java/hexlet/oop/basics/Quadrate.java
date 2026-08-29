package hexlet.oop.basics;

public class Quadrate implements Geometric {
    private int side;

    public Quadrate(int side) {
        this.side = side;
    }

    public double getSquare() {
        return side * side;
    }

    public String getName() {
        return "quadrate";
    }
}
