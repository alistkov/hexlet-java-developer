package hexlet;

import hexlet.functions.Exercise;
import hexlet.functions.model.User;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var users =
                new ArrayList<>(
                        List.of(
                                new User("Salli", LocalDate.of(1990, 12, 15)),
                                new User("Gawen", LocalDate.of(2002, 10, 23)),
                                new User("Emmalee", LocalDate.of(1992, 9, 16))));

        var oldestUser = Exercise.getOldest(users);
        System.out.println(oldestUser); // => User(name=Salli, birthday=1190-12-15)
    }
}
