package hexlet;

import hexlet.streams.Exercise;
import hexlet.streams.model.Product;

import java.util.List;

public class App {
    public static void main(String[] args) {
        var products = List.of(
                new Product("Smartphone", "electronics", 500),
                new Product("Laptop", "electronics", 1000),
                new Product("Headphones", "electronics", 100),
                new Product("Smart Watch", "electronics", 300),
                new Product("T-Shirt", "cloth", 20),
                new Product("Sneakers", "shoes", 100),
                new Product("Coffee Machine", "kitchen", 200),
                new Product("Sunglasses", "accessories", 50),
                new Product("Book", "books", 15),
                new Product("Gaming Console", "electronics", 400)
        );

        System.out.println(Exercise.getTotalPrice(products)); // 2300
    }
}
