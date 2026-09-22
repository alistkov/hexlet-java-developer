package hexlet;

import hexlet.streams.Exercise;
import hexlet.streams.model.User;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var users = new ArrayList(
                List.of(
                        new User(1, "John"),
                        new User(2, "Anna"),
                        new User(3, "Alex")
                )
        );

//        var user = Exercise.findUserById(users, 1);
//        System.out.println(user.getName()); // John

// Пользователя с таким id нет
        System.out.println(Exercise.findUserById(users, 10)); // Error
    }
}
