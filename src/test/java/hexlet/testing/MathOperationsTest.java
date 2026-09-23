package hexlet.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationsTest {
    @Test
    public void testSum() {
        assertEquals(7, MathOperations.sum(2, 5));
    }

    @Test
    public void testSub() {
        assertEquals(3, MathOperations.sub(7, 4));
    }
}
