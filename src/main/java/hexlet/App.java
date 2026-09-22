package hexlet;

import hexlet.streams.Exercise;

import java.util.List;

public class App {
    public static void main(String[] args) {
        var emails = List.of(
                "info@yandex.ru",
                "mk@host.com",
                "support@hexlet.io",
                "sergey@gmail.com",
                "vovan@gmail.com",
                "vovan@hotmail.com"
        );

        var result = Exercise.getFreeDomainsCount(emails);
        System.out.println(result); // => {gmail.com=2, yandex.ru=1, hotmail.com=1}
    }
}
