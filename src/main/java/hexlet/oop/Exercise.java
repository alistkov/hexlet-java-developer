package hexlet.oop;

import java.util.List;

public class Exercise {
    public static List<String> buildApartmentsList(List<Home> apartments, int count) {
        return apartments.stream()
                .sorted(Home::compareTo)
                .limit(count)
                .map(Home::toString)
                .toList();
    }

    public static void swapKeyValue(KeyValueStorage storage) {
        storage.toMap()
                .forEach(
                        (key, value) -> {
                            storage.set(value, key);
                            storage.unset(key);
                        });
    }

    public static void printSquare(Circle circle) {
        try {
            var square = circle.getSquare();
            System.out.println(Math.round(square));
        } catch (NegativeRadiusException e) {
            System.out.println("Не удалось посчитать площадь");
        } finally {
            System.out.println("Вычисление окончено");
        }
    }
}
