package hexlet;

public class App {
    public static void main(String[] args) {
        System.out.println(Loops.compress("aaabcccc")); // => "a3bc4"
        System.out.println(Loops.compress("abcd"));      // => "abcd"
        System.out.println(Loops.compress("aabbaa"));    // => "a2b2a2"
        System.out.println(Loops.compress(""));          // => ""
    }
}
