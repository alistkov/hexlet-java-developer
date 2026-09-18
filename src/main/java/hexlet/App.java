package hexlet;

import hexlet.classes.ProductsStorage;

public class App {
    public static void main(String[] args) {
        var storage = new ProductsStorage(20, 50);
        storage.placeProducts(20);
        System.out.println(storage.getGoodsQuantity());
        storage.placeProducts(20);
        System.out.println(storage.getGoodsQuantity());
        storage.placeProducts(10);
        System.out.println(storage.getGoodsQuantity());
        storage.takeProducts(30);
        System.out.println(storage.getGoodsQuantity());
        storage.takeProducts(30);
        System.out.println(storage.getGoodsQuantity());
        storage.takeProducts(20);
        System.out.println(storage.getGoodsQuantity());
    }
}
