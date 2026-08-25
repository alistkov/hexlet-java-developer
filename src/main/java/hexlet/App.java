package hexlet;

public class App {
    public static void main(String[] args) {
        System.out.println(Loops.hasChar("Renly", 'R')); // true
        System.out.println(Loops.hasChar("Renly", 'r')); // false
        System.out.println(Loops.hasChar("Tommy", 'm')); // true
        System.out.println(Loops.hasChar("Tommy", 'd')); // false
    }
}
