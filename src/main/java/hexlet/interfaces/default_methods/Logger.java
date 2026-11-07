package hexlet.interfaces.default_methods;

public interface Logger {
    void log(Level level, String message);

    default void info(String message) {
        log(Level.INFO, message);
    }

    default void warn(String message) {
        log(Level.WARN, message);
    }

    default void error(String message) {
        log(Level.ERROR, message);
    }

    default void warn(String message, Throwable cause) {
        warn(withCause(message, cause));
    }

    default void error(String message, Throwable cause) {
        error(withCause(message, cause));
    }

    private String withCause(String message, Throwable cause) {
        return message + ": " + cause.getMessage();
    }
}
