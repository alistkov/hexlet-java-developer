package hexlet.streams;

import hexlet.streams.model.Person;
import hexlet.streams.model.Product;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise {
    private static final List<String> FREE_DOMAINS = List.of(
            "gmail.com",
            "yandex.ru",
            "hotmail.com",
            "yahoo.com"
    );

    public static List<String> sortWords(List<String> words) {
        return words.stream().sorted().toList();
    }

    public static List<String> normalize(List<String> emails) {
        return emails.stream().map(email -> email.strip().toLowerCase()).toList();
    }

    public static List<String> getAdultUserNames(List<Person> users) {
        return users.stream().filter(user -> user.getAge() >= 18).map(Person::getName).toList();
    }

    public static Double getAverageAge(List<Person> users) {
        if (users.isEmpty()) {
            return null;
        }

        var totalAges = users.stream()
                .reduce(0.0, (acc, currentUser) -> acc + currentUser.getAge(), Double::sum);
        return totalAges / users.size();
    }

    public static int getTotalPrice(List<Product> products) {
        return products.stream()
                .filter(product -> product.getCategory().equals("electronics"))
                .map(Product::getPrice)
                .reduce(0, Integer::sum);
    }

    public static Map<String, Long> getFreeDomainsCount(List<String> emails) {
        return emails.stream()
                .map(email -> email.split("@")[1])
                .filter(FREE_DOMAINS::contains)
                .collect(Collectors.groupingBy(domain -> domain, Collectors.counting()));
    }
}
