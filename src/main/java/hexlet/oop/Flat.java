package hexlet.oop;

public class Flat implements Home {
    private final double area;
    private final double balcony;
    private final int floor;

    public Flat(double area, double balcony, int floor) {
        this.area = area;
        this.balcony = balcony;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return area + balcony;
    }

    @Override
    public int compareTo(Home home) {
        if (getArea() > home.getArea()) {
            return 1;
        }

        if (getArea() < home.getArea()) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return String.format("Квартира площадью %s метров на %d этаже", getArea(), floor);
    }
}
