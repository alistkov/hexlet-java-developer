package hexlet.oop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseTest {
    @Test
    public void testBuildApartmentsList() {
        List<Home> apartments =
                new ArrayList<>(
                        List.of(
                                new Flat(41, 3, 10),
                                new Cottage(125.5, 2),
                                new Flat(80, 10, 2),
                                new Cottage(150, 3)));

        List<String> expected =
                new ArrayList<>(
                        List.of(
                                "Квартира площадью 44.0 метров на 10 этаже",
                                "Квартира площадью 90.0 метров на 2 этаже",
                                "2 этажный коттедж площадью 125.5 метров"));

        List<String> result = Exercise.buildApartmentsList(apartments, 3);
        assertEquals(expected, result);
    }

    @Test
    public void testBuildApartmentsList2() {
        List<Home> apartments =
                new ArrayList<>(
                        List.of(
                                new Cottage(100, 1),
                                new Flat(190, 10, 2),
                                new Flat(180, 30, 5),
                                new Cottage(250, 3)));

        List<String> expected =
                new ArrayList<>(
                        List.of(
                                "1 этажный коттедж площадью 100.0 метров",
                                "Квартира площадью 200.0 метров на 2 этаже",
                                "Квартира площадью 210.0 метров на 5 этаже",
                                "3 этажный коттедж площадью 250.0 метров"));

        List<String> result = Exercise.buildApartmentsList(apartments, 4);
        assertEquals(expected, result);
    }

    @Test
    public void testBuildApartmentsList3() {
        List<Home> apartments = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        List<String> result = Exercise.buildApartmentsList(apartments, 10);
        assertEquals(expected, result);
    }

    @Test
    void testSwapKV() {
        KeyValueStorage storage = new InMemoryKV(Map.of("key", "value"));
        storage.set("key2", "value2");
        Exercise.swapKeyValue(storage);
        assertEquals("default", storage.get("key3", "default"));
        assertEquals("key", storage.get("value", ""));
        assertEquals("key2", storage.get("value2", ""));
    }

    @Test
    void testSwapKV2() {
        KeyValueStorage storage = new InMemoryKV(Map.of("foo", "bar", "bar", "zoo"));
        Exercise.swapKeyValue(storage);
        Map<String, String> expected = Map.of("bar", "foo", "zoo", "bar");
        assertEquals(expected, storage.toMap());
    }
}
