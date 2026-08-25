package hexlet;

public class App {
    public static void main(String[] args) {
        System.out.println(ConditionalStatements.convertString("Hello")); // "Hello"
        System.out.println(ConditionalStatements.convertString("hello")); // "olleh"

// Не забудьте учесть пустую строку!
        System.out.println(ConditionalStatements.convertString("")); // ""
    }
}
