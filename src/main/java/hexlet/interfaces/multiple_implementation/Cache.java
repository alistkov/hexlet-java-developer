package hexlet.interfaces.multiple_implementation;

public interface Cache {
    String get(String key);

    void put(String key, String value);
}
