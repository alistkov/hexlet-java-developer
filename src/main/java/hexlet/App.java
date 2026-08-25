package hexlet;

public class App {
    public static void main(String[] args) {
        System.out.println(Loops.encrypt("move")); // "omev"
        System.out.println(Loops.encrypt("attack")); // "taatkc"
        // Если число символов нечётное
        // то последний символ остается на своем месте
        System.out.println(Loops.encrypt("go!")); // "og!"
    }
}
