package hexlet.streams;

import hexlet.streams.model.Person;
import java.util.List;

public class Exercise {
    public static List<String> sortWords(List<String> words) {
        return words.stream().sorted().toList();
    }

    public static List<String> normalize(List<String> emails) {
        return emails.stream().map(email -> email.strip().toLowerCase()).toList();
    }

    public static List<String> getAdultUserNames(List<Person> users) {
        return users.stream().filter(user -> user.getAge() >= 18).map(Person::getName).toList();
    }
}
