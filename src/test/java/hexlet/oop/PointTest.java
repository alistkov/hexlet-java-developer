package hexlet.oop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    public void testPoint() {
        var point = new Point(2, 3);
        assertEquals(2, point.getX());
        assertEquals(3, point.getY());
    }
}
