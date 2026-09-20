package hexlet.functions;

public class Exercise {
    public static double average(int number, int... numbers) {
        var sum = (double) number;
        for (var num : numbers) {
            sum += num;
        }
        return sum / (numbers.length + 1);
    }
}
