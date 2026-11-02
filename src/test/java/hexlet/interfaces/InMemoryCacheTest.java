package hexlet.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InMemoryCacheTest {

    @Test
    public void inMemoryCacheStoresValues() {
        var cache = new InMemoryCache();
        cache.put("user:007", "Bond");

        assertEquals("Bond",  cache.get("user:007"));
        assertNull(cache.get("user:008"));

        cache.put("user:007", "James Bond");
        assertEquals("James Bond",  cache.get("user:007"));
    }

    @Test
    void inMemoryCacheCountsHitsAndMisses() {
        var cache = new InMemoryCache();
        assertEquals(0, cache.hits());
        assertEquals(0, cache.misses());

        cache.put("user:007", "James Bond");
        assertEquals(0, cache.hits());
        assertEquals(0, cache.misses());

        cache.get("user:007");
        cache.get("user:008");
        cache.get("user:007");
        cache.get("user:009");
        cache.get("user:006");

        assertEquals(2, cache.hits());
        assertEquals(3, cache.misses());
    }
}
