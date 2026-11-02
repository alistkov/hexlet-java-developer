package hexlet.interfaces;

import java.util.HashMap;

public class InMemoryCache implements Cache, StatsProvider {

    private final HashMap<String, String> cache;
    private int hitsCount;
    private int missesCount;

    public InMemoryCache() {
        cache = new HashMap<>();
        hitsCount = 0;
        missesCount = 0;
    }

    @Override
    public String get(String key) {
        var entry = cache.get(key);

        if (entry == null) {
            missesCount += 1;
        } else {
            hitsCount += 1;
        }
        return entry;
    }

    @Override
    public void put(String key, String value) {
        cache.put(key, value);
    }

    @Override
    public int hits() {
        return hitsCount;
    }

    @Override
    public int misses() {
        return missesCount;
    }
}
