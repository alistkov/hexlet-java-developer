package hexlet.oop;

public class Circle {
    private final int radius;
    private final Point center;

    public Circle(Point center, int radius) {
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("");
        }
        return Math.PI * radius * radius;
    }
}
