package hexlet;

import hexlet.streams.Exercise;
import hexlet.streams.model.Film;

import java.util.List;

public class App {
    public static void main(String[] args) {
        var films = List.of(
                new Film("Liquid Sky", List.of("thriller", "Action")),
                new Film("Superman", List.of("Action", "fantasy", "thriller")),
                new Film("Norwegian Ninja", List.of("THRILLER"))
        );

        var result = Exercise.getGenres(films);
        System.out.println(result); // => {"action"=2,"thriller"=3,"fantasy"=1}
    }
}
