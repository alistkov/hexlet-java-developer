package hexlet;

import hexlet.lists.ArrayListMethods;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var capitals = List.of("london", "berlin", "tokio");
        System.out.println(ArrayListMethods.getOrDefault(capitals, 1, "")); // "berlin"
        System.out.println(ArrayListMethods.getOrDefault(capitals, 2, "")); // "tokio"
        System.out.println(ArrayListMethods.getOrDefault(capitals, 5, "")); // ""
        System.out.println(ArrayListMethods.getOrDefault(capitals, -2, "")); // ""
    }
}
