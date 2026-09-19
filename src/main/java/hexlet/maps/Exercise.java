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
}
