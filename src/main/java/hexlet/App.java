package hexlet;

import hexlet.classes.TextUtils;

public class App {
    public static void main(String[] args) {
        System.out.println(TextUtils.getWordsCount("")); // 0
        System.out.println(TextUtils.getWordsCount("man in BlacK")); // 3
        System.out.println(TextUtils.getWordsCount("  hello, world!  ")); // 2
    }
}
