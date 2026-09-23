package hexlet.testing;

import static hexlet.testing.Fill.fill;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FillTest {
    private final List<String> coll = new ArrayList<>();

    @BeforeEach
    public void beforeEach() {
        coll.addAll(Arrays.asList("a", "b", "c", "d"));
    }

    @Test
    public void testCommonCase() {
        var actual1 = List.of("a", "*", "*", "d");
        fill(coll, "*", 1, 3);
        assertEquals(actual1, coll);
    }

    @Test
    public void testDefaultStartAndEnd() {
        var actual = List.of("*", "*", "*", "*");
        fill(coll, "*");
        assertEquals(actual, coll);
    }

    @Test
    public void testFillWithoutEnd() {
        var actual = List.of("a", "*", "*", "*");
        fill(coll, "*", 1);
        assertEquals(actual, coll);
    }

    @Test
    public void testStartMoreSize() {
        var actual2 = List.of("a", "b", "c", "d");
        fill(coll, "*", 4, 6);
        assertEquals(actual2, coll);
    }

    @Test
    public void testEndMoreLength() {
        var actual3 = List.of("*", "*", "*", "*");
        fill(coll, "*", 0, 10);
        assertEquals(actual3, coll);
    }

    @Test
    public void testStartMoreOrEqualEnd() {
        fill(coll, "*", 2, 2);
        var expected = List.of("a", "b", "c", "d");
        assertEquals(expected, coll);
    }
}
