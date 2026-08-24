package hexlet;

import org.apache.commons.lang3.StringUtils;

public class ConditionalStatements {
    public static boolean isPensioner(int age) {
        return age >= 60;
    }

    public static boolean isPalindrome(String word) {
        var reversed = StringUtils.reverse(word);
        return word.equalsIgnoreCase(reversed);
    }
}
