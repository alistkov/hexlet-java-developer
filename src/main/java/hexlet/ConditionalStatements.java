package hexlet;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;

public class ConditionalStatements {
    public static boolean isPensioner(int age) {
        return age >= 60;
    }

    public static boolean isPalindrome(String word) {
        var reversed = StringUtils.reverse(word);
        return word.equalsIgnoreCase(reversed);
    }

    public static boolean isInternationalPhone(String phone) {
        var firstSymbol = phone.charAt(0);
        return firstSymbol == '+';
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static boolean notToday(String date) {
        return !date.equalsIgnoreCase(LocalDate.now().toString());
    }

    public static void isValid(int age, boolean hasConsent) {
        System.out.println(age >= 18 && hasConsent);
    }

    public static String getSentenceTone(String sentence) {
        return sentence.equals(sentence.toUpperCase()) ? "scream" : "normal";
    }

    public static String normalizeUrl(String url) {
        return url.startsWith("https://") ? url : "https://" + url;
    }

    public static String whoIsThisHouseToStarks(String family) {
        if (family.equalsIgnoreCase("Karstark") || family.equalsIgnoreCase("Tally")) {
            return "friend";
        }
        if (family.equalsIgnoreCase("Lannister") || family.equalsIgnoreCase("Frey")) {
            return "enemy";
        }
        return "neutral";
    }
}
