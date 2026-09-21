package hexlet;

import hexlet.functions.Exercise;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        var words = new ArrayList<String>();
        words.add("Java");
        words.add("Python");
        words.add("PHP");
        var result = Exercise.map(words, String::toUpperCase);

        System.out.println(result); // ["JAVA", "PYTHON", "PHP"]
    }
}
