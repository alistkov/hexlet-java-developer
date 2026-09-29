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
}
