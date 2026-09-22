package hexlet.streams;

import hexlet.streams.model.Person;
import hexlet.streams.model.Product;

import java.util.List;

public class Exercise {
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
}
