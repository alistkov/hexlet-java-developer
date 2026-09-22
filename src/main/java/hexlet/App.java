package hexlet;

import hexlet.streams.Exercise;
import hexlet.streams.model.Person;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var people =
                new ArrayList(
                        List.of(
                                new Person("John", 17),
                                new Person("Anna", 24),
                                new Person("Alex", 35)));

        var names = Exercise.getAdultUserNames(people);
        System.out.println(names); // => [Anna, Alex]
    }
}
