package hexlet.functions;

import java.util.Map;

public class Exercise {
    public static double average(int number, int... numbers) {
        var sum = (double) number;
        for (var num : numbers) {
            sum += num;
        }
        return sum / (numbers.length + 1);
    }

    public static void printBalance(Map<String, Integer> products, int minCount) {
        products.forEach((productName, count) -> {
            if (count < minCount) {
                System.out.println(productName);
            }
        });
    }
}
