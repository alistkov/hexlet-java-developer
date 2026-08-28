package hexlet;

public class OopBasics {
    public static double getSquare(int sideA, int sideB, int angle) {
        var radians = (angle * Math.PI) / 180;
        return  (sideA * sideB * Math.sin(radians)) / 2;
    }

    public static Point getNewPoint() {
        return new Point(5, 10);
    }
}
