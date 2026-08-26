package hexlet;

public class ArraysTrack {
    public static String[] getWeekends(String format) {
        return format.equalsIgnoreCase("short")
                ? new String[]{"sat", "sun"}
                : new String[]{"saturday", "sunday"};
    }

    public static void swap(int[] numbers) {
        if (numbers.length < 2) {
            return;
        }

        var lastIndex = numbers.length - 1;
        var first = numbers[0];
        var last = numbers[lastIndex];
        numbers[0] = last;
        numbers[lastIndex] = first;
    }
}
