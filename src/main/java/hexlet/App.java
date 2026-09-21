package hexlet;

import hexlet.generics.SimpleTriple;

public class App {
    public static void main(String[] args) {
        var triple = new SimpleTriple<String, Integer, Boolean>("str", 1, true);

        var reversed = triple.reverse();

        reversed.getLeft(); // true
        reversed.getMiddle(); // 1
        reversed.getRight(); // str

        var triple1 = new SimpleTriple<>(1, "s", true);
        var triple2 = new SimpleTriple<>(1, "s", true);
        var triple3 = new SimpleTriple<>(1, "str", true);

        System.out.println(triple1.isEqualTo(triple2));
        System.out.println(triple1.isEqualTo(triple3));
    }
}
