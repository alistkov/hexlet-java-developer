package hexlet;

public class App {
    public static void main(String[] args) {
        String[] banknotes1 = {"eur 10", "usd 1", "usd 10", "rub 50", "usd 5"};
        System.out.println(ArraysTrack.getTotalAmount(banknotes1, "usd")); // 16

        String[] banknotes2 = {"eur 10", "usd 1", "eur 5", "rub 100", "eur 20", "eur 100", "rub 200"};
        System.out.println(ArraysTrack.getTotalAmount(banknotes2, "eur")); // 135

        String[] banknotes3 = {"eur 10", "rub 50", "eur 5", "rub 10", "rub 10", "eur 100", "rub 200"};
        System.out.println(ArraysTrack.getTotalAmount(banknotes3, "rub")); // 270
    }
}
