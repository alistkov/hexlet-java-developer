package hexlet;

public class App {
    public static void main(String[] args) {
        // предположим сегодня 2012-11-25
        System.out.println(ConditionalStatements.notToday("2026-08-25")); // false
        System.out.println(ConditionalStatements.notToday("2013-11-25")); // true
        System.out.println(ConditionalStatements.notToday("2013-09-01")); // true
    }
}
