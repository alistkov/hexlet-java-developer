package hexlet;

import static hexlet.MathOperations.sum;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathOperationsTest {
    @Test
    public void testSum() {
        assertEquals(5, sum(2, 3));
    }
}
