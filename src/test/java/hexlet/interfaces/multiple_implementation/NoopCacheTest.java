package hexlet.interfaces.multiple_implementation;

import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class NoopCacheTest {

    @Test
    public void noopCacheTest() {
        var cache = new NoopCache();
        CacheWarmer.warmUp(cache, Map.of("user:42", "Мила"));

        assertNull(cache.get("user:42"), "NoopCache ничего не хранит, get() возвращает null");
    }
}
