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

    public static String[] addPrefix(String[] names, String prefix) {
        var result = new String[names.length];

        for (var i = 0; i < names.length; i += 1) {
            result[i] = prefix + " " + names[i];
        }
        return result;
    }

    public static int calculateSum(int[] numbers) {
        var sum = 0;

        for (var i = 0; i < numbers.length; i += 1) {
            if (numbers[i] % 3 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }
}
