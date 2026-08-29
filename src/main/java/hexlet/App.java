package hexlet;

import hexlet.oop.basics.*;

public class App {
    public static void main(String[] args) throws Exception {
        var figure1 = new Rectangle(4, 5);
        OopBasics.printSquare(figure1); // => 20

        var figure2 = new Rectangle(-4, 5);
        OopBasics.printSquare(figure2); // => Не удалось посчитать площадь
    }
}
