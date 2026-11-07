package hexlet.interfaces.default_methods;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoggerTest {
    record Entry(Level level, String message) {}

    static class RecordingLogger implements Logger {
        final List<Entry> entries = new ArrayList<>();

        @Override
        public void log(Level level, String message) {
            entries.add(new Entry(level, message));
        }
    }

    private RecordingLogger logger;

    @BeforeEach
    void setUp() {
        logger = new RecordingLogger();
    }

    @Test
    public void infoTest() {
        logger.info("Info message");

        assertEquals(List.of(new Entry(Level.INFO, "Info message")), logger.entries);
    }

    @Test
    void warnTest() {
        logger.warn("Warn message");
        assertEquals(List.of(new Entry(Level.WARN, "Warn message")), logger.entries);
    }

    @Test
    void error() {
        logger.error("Error message");
        assertEquals(List.of(new Entry(Level.ERROR, "Error message")), logger.entries);
    }

    @Test
    void warnWithCauseTest() {
        logger.warn("Повторная отправка письма", new RuntimeException("Connection refused"));
        assertEquals(
                List.of(new Entry(Level.WARN, "Повторная отправка письма: Connection refused")),
                logger.entries);
    }

    @Test
    void errorWithCauseTest() {
        logger.error("Не удалось сохранить заказ", new IllegalStateException("База недоступна"));
        assertEquals(
                List.of(new Entry(Level.ERROR, "Не удалось сохранить заказ: База недоступна")),
                logger.entries);
    }
}
