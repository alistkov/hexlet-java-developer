package hexlet.oop;

public class Cottage implements Home {
    private final double area;
    private final int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(Home cottage) {
        if (getArea() > cottage.getArea()) {
            return 1;
        }

        if (getArea() < cottage.getArea()) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return String.format("%d этажный коттедж площадью %s метров", floorCount, getArea());
    }
}
