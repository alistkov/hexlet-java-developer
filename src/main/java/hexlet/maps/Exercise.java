package hexlet.maps;

import hexlet.maps.model.Data;
import java.util.Map;

public class Exercise {
    private static Map<String, Double> products = Data.getProducts();

    public static Double getPriceWithDiscount(Map<String, Double> discounts, String productName) {
        var price = products.get(productName);

        if (price == null) {
            return null;
        }

        var discount = discounts.getOrDefault(productName, 0.0);
        return price * (100 - discount) / 100;
    }

    public static String getMostPopulatedCity(Map<String, Integer> cities) {
        if (cities.isEmpty()) {
            return null;
        }

        var maxPopulation = 0;
        String cityName = null;

        for (var city : cities.entrySet()) {
            var cityPopulation = city.getValue();
            if (cityPopulation > maxPopulation) {
                cityName = city.getKey();
                maxPopulation = cityPopulation;
            }
        }
        return cityName;
    }
}
