package hexlet;

public class ArraysTrack {
    public static String[] getWeekends(String format) {
        return format.equalsIgnoreCase("short")
                ? new String[]{"sat", "sun"}
                : new String[]{"saturday", "sunday"};
    }
}
