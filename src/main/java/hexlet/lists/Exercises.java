package hexlet.lists;

import java.util.ArrayList;
import java.util.List;

public class Exercises {
    public static String getOrDefault(List<String> collection, int index, String defaultValue) {
        if (index < 0 || index >= collection.size()) {
            return defaultValue;
        }

        return collection.get(index);
    }

    public static ArrayList<Integer> replaceByZero(List<Integer> numbers) {
        var result = new ArrayList<Integer>();

        for (var number : numbers) {
            var processedNumber = number > 0 ? number : 0;
            result.add(processedNumber);
        }

        return result;
    }
}
