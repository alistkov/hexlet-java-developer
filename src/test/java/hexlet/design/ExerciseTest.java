package hexlet.design;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseTest {
    private LocalDate now;

    @BeforeEach
    public void setUp() {
        now = LocalDate.now();
    }

    @Test
    public void testGetRide() {
        var car = new Car("audi a4", "1FTEX1E81AF746863");
        var customer = new Customer("John Bin");

        var actualRide = Exercise.getRide(customer, car);
        assertEquals(car, actualRide.getCar());
        assertEquals(customer, actualRide.getCustomer());
        assertEquals(now, actualRide.getStartedAt());
    }
}
