package hexlet.interfaces;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Instant;
import org.junit.jupiter.api.Test;

public class ClockTest {
    private static final Instant EXPIRES_AT = Instant.parse("2026-09-23T12:00:00Z");

    @Test
    public void clockIsInterface() {
        assertTrue(Clock.class.isInterface(), "Clock must be declared as an interface");
    }

    @Test
    public void fixedClockReturnsGivenTime() {
        var time = Instant.parse("2026-09-23T11:59:00Z");
        Clock clock = new FixedClock(time);
        assertEquals(time, clock.now(), "FixedClock returns the time from the constructor");
        assertEquals(time, clock.now(), "FixedClock does not change the time between calls");
    }

    @Test
    void systemClockReturnsCurrentTime() {
        Clock clock = new SystemClock();

        var before = Instant.now();
        var actual = clock.now();
        var after = Instant.now();
        assertTrue(
                !actual.isBefore(before) && !actual.isAfter(after),
                "SystemClock returns the current time");
    }
}
