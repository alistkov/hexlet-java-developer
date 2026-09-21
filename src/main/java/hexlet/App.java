package hexlet;

import hexlet.generics.ListUtils;
import hexlet.generics.model.Woman;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var people = new ArrayList<>(List.of(
                new Woman("Anna"),
                new Woman("Gina"),
                new Woman("Nina")
        ));

        System.out.println(ListUtils.findFirstIndex(people, "G")); // 1
        System.out.println(ListUtils.findFirstIndex(people, "O")); // -1
    }
}
