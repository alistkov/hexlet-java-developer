package hexlet;

public class App {
    public static void main(String[] args) {
        var text = "I never look back";
        System.out.println(Loops.makeItFunny(text, 3)); // "I NevEr LooK bAck"
        System.out.println(Loops.makeItFunny("hello", 2));
    }
}
