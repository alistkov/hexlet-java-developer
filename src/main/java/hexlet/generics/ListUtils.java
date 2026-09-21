package hexlet.generics;

import hexlet.generics.model.Human;
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

    public static int findFirstIndex(List<? extends Human> humans, String namePrefix) {
        for (var i = 0; i < humans.size(); i += 1) {
            if (humans.get(i).getName().startsWith(namePrefix)) {
                return i;
            }
        }
        return -1;
    }
}
