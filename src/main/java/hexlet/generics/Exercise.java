package hexlet.generics;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    public static List<Integer> duplicate(List<Integer> numbers) {
        var copy = new ArrayList<>(numbers);
        copy.replaceAll(num -> num * 2);
        return copy;
    }
}
