package hexlet.functions;

import hexlet.functions.model.User;
import java.util.ArrayList;
import java.util.List;
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
        products.forEach(
                (productName, count) -> {
                    if (count < minCount) {
                        System.out.println(productName);
                    }
                });
    }

    public static User getOldest(List<User> users) {
        if (users.isEmpty()) {
            return null;
        }

        var usersCopy = new ArrayList<>(users);
        usersCopy.sort((u1, u2) -> u1.getBirthday().compareTo(u2.getBirthday()));
        return usersCopy.getFirst();
    }
}
