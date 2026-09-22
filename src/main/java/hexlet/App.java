package hexlet;

import hexlet.streams.Exercise;
import hexlet.streams.model.Person;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
//        var people = new ArrayList(
//                List.of(
//                        new Person("John", 17),
//                        new Person("Anna", 24),
//                        new Person("Alex", 57),
//                        new Person("Jun", 32)
//                )
//        );
        var actual = Exercise.getAverageAge(new ArrayList<Person>());
        System.out.println(actual);

//        System.out.println(Exercise.getAverageAge(people)); // 32.5
    }
}
