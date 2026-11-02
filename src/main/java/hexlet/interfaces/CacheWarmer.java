package hexlet.interfaces;

import java.util.Map;

public class CacheWarmer {
    public static void warmUp(Cache cache, Map<String, String> entries) {
        for (var entry : entries.entrySet()) {
            cache.put(entry.getKey(), entry.getValue());
        }
    }
}
