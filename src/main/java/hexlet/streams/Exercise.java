package hexlet.streams;

import java.util.List;

public class Exercise {
    public static List<String> sortWords(List<String> words) {
        return words.stream().sorted().toList();
    }

    public static List<String> normalize(List<String> emails) {
        return emails.stream()
                .map(email -> email.strip().toLowerCase())
                .toList();
    }
}
