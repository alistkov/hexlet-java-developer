package hexlet.oop;

import java.lang.reflect.Field;
import java.util.List;

public class Validator {
    public static List<String> validate(Object obj) {
        var fields = List.of(obj.getClass().getDeclaredFields());
        return fields.stream()
                .filter(field -> field.isAnnotationPresent(NotNull.class))
                .filter(field -> {
                    Object value;
                    try {
                        field.setAccessible(true);
                        value = field.get(obj);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    return value == null;
                })
                .map(Field::getName)
                .toList();
    }
}
