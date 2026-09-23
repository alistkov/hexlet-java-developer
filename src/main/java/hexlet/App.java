package hexlet;

import hexlet.design.model.Pizza;

public class App {
    public static void main(String[] args) {
        System.out.println("Hexlet Java Developer");
    }

    public static Pizza getPizza() {
        return Pizza.builder()
                .size("big")
                .dough("thin")
                .cheeseTopping("mozzarella")
                .sauce("tomato")
                .vegetableTopping("basil")
                .build();
    }
}
