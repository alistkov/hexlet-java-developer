package hexlet;

import hexlet.lists.Exercises;
import hexlet.lists.model.Car;
import java.time.LocalDate;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var cars =
                List.of(
                        new Car("Jaguar", "XK120", LocalDate.of(1950, 8, 21)),
                        new Car("Mercedes-Benz", "W114", LocalDate.of(1968, 7, 10)),
                        new Car("Fiat", "600", LocalDate.of(1956, 1, 1)));

        var result = Exercises.getCars(cars, 1960);
        System.out.println(result); // => [Fiat 600, Jaguar XK120]
    }
}
