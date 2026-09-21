package hexlet.functions;

import hexlet.functions.model.Book;
import hexlet.functions.model.User;

import java.util.*;

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

    public static Map<String, Integer> countNumbers(List<Integer> numbers) {
        var result = new HashMap<>(Map.of("negative", 0, "zero", 0, "positive", 0));
        numbers.forEach(
                number -> {
                    var type = getNumberType(number);
                    result.compute(type, (key, count) -> count + 1);
                });

        return result;
    }

    public static String getNumberType(int number) {
        if (number < 0) {
            return "negative";
        }

        if (number > 0) {
            return "positive";
        }

        return "zero";
    }

    public static int calculate(int a, int b, BinaryOperation fn) {
        return fn.apply(a, b);
    }

    public static List<Book> sortBooks(List<Book> books) {
        var copy = new ArrayList<>(books);
        copy.sort(Comparator.comparing(Book::getTitle).reversed());
        return copy;
    }
}
