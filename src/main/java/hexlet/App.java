package hexlet;

import hexlet.maps.Exercise;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        var cities =
                Map.of(
                        "White River", 1,
                        "Kashmor", 2,
                        "Oxford", 3);

        System.out.println(Exercise.getMostPopulatedCity(cities)); // Kashmor
    }
}
