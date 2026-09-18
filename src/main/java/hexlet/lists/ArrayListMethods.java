package hexlet.lists;

import java.util.List;

public class ArrayListMethods {
    public static String getOrDefault(List<String> collection, int index, String defaultValue) {
        if (index < 0 || index >= collection.size()) {
            return defaultValue;
        }

        return collection.get(index);
    }
}
