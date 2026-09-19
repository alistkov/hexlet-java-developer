package hexlet.lists;

import hexlet.lists.model.Book;
import hexlet.lists.model.Car;
import hexlet.lists.model.Product;
import hexlet.lists.model.User;

import java.util.ArrayList;
import java.util.List;

public class Exercises {
    public static String getOrDefault(List<String> collection, int index, String defaultValue) {
        if (index < 0 || index >= collection.size()) {
            return defaultValue;
        }

        return collection.get(index);
    }

    public static ArrayList<Integer> replaceByZero(List<Integer> numbers) {
        var result = new ArrayList<Integer>();

        for (var number : numbers) {
            var processedNumber = number > 0 ? number : 0;
            result.add(processedNumber);
        }

        return result;
    }

    public static List<String> getProductsByPrice(
            List<Product> products, int minPrice, int maxPrice) {
        var productTitles = new ArrayList<String>();

        for (var product : products) {
            var productPrice = product.getPrice();

            if (productPrice >= minPrice && productPrice <= maxPrice) {
                productTitles.add(product.getTitle());
            }
        }

        return productTitles;
    }

    public static int countBooks(List<Book> books, String author, String genre) {
        var booksCount = 0;

        for (var book : books) {
            var bookAuthor = book.getAuthorName();
            var bookGenre = book.getGenre();

            if (author.equals(bookAuthor) && genre.equals(bookGenre)) {
                booksCount += 1;
            }
        }

        return booksCount;
    }

    public static List<User> getCommonFriends(User firstUser, User secondUser) {
        var commonFriends = new ArrayList<>(firstUser.getFriends());
        commonFriends.retainAll(secondUser.getFriends());
        return commonFriends;
    }

    public static List<String> getCars(List<Car> cars, int manufacturedYear) {
        var carsNames = new ArrayList<String>();

        for (var car : cars) {
            var manufacturedAt = car.getManufacturedAt();

            if (manufacturedAt.getYear() < manufacturedYear) {
                carsNames.add(car.toString());
            }
        }

        carsNames.sort(String.CASE_INSENSITIVE_ORDER);
        return carsNames;
    }
}
