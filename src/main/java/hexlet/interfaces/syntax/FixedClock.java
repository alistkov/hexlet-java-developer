package hexlet.interfaces.syntax;

import java.time.Instant;

public class FixedClock implements Clock {
    private final Instant instant;

    public FixedClock(Instant instant) {
        this.instant = instant;
    }

    @Override
    public Instant now() {
        return instant;
    }
}
