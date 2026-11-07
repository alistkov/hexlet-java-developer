package hexlet.interfaces.multiple_implementation;

public class NoopCache implements Cache {
    @Override
    public String get(String key) {
        return null;
    }

    @Override
    public void put(String key, String value) {}
}
