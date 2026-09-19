package hexlet;

import hexlet.lists.Exercises;
import hexlet.lists.model.Product;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var products =
                List.of(new Product("bread", 5), new Product("milk", 10), new Product("fish", 30));

        var result = Exercises.getProductsByPrice(products, 10, 30);
        System.out.println(result); // => ["milk", "fish"]
    }
}
