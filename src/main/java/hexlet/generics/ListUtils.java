package hexlet.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListUtils {
    public static <T> List<T> filter(List<T> collection, Predicate<T> fn) {
        var result = new ArrayList<T>();
        for (var item : collection) {
            if (fn.test(item)) {
                result.add(item);
            }
        }

        return result;
    }
}
