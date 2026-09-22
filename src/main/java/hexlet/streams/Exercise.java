package hexlet.streams;

import java.util.List;

public class Exercise {
    public static List<String> sortWords(List<String> words) {
        return words.stream().sorted().toList();
    }
}
