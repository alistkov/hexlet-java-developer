package hexlet.oop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class InMemoryKVTest {
    @Test
    void inMemoryKVTest() {
        KeyValueStorage storage = new InMemoryKV(Map.of("key", "10"));
        assertEquals("default", storage.get("key2", "default"));
        assertEquals("10", storage.get("key", "default"));

        storage.set("key2", "value2");
        storage.set("key", "value");

        assertEquals("value2", storage.get("key2", "default"));
        assertEquals("value", storage.get("key", "default"));

        storage.unset("key");
        assertEquals("def", storage.get("key", "def"));
        assertEquals(Map.of("key2", "value2"), storage.toMap());
    }

    @Test
    void mustBeImmutableTest() {
        Map<String, String> initial = new HashMap<>();
        initial.put("key", "10");

        Map<String, String> clonedInitial = new HashMap<>();
        clonedInitial.putAll(initial);

        KeyValueStorage storage = new InMemoryKV(initial);

        initial.put("key2", "value2");
        assertEquals(clonedInitial, storage.toMap());

        Map<String, String> map = storage.toMap();
        map.put("key2", "value2");
        assertEquals(clonedInitial, storage.toMap());
    }
}
