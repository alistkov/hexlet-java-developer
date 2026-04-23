package hexlet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumTest {
    @Test
    public void testSum() {
        assertEquals(3, Sum.sum(1, 2));
    }
}
