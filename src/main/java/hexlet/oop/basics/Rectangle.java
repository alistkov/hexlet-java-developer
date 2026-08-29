package hexlet.oop.basics;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getSquare() throws Exception {
        if (width < 0 || height < 0) {
            throw new Exception("Не удалось посчитать площадь");
        }

        return width * height;
    }
}
