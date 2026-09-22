package hexlet;

import hexlet.streams.Exercise;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var emails = List.of("Mark@Gmail.com", "  AnnA@mail.io  ", "john@GMAIL.com");
        var result = Exercise.normalize(emails);
        System.out.println(result); // => [mark@gmail.com, anna@mail.io, john@gmail.com]
    }
}
