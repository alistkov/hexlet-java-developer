package hexlet;

public class Loops {
    public static void printNumbers(int firstNumber) {
        var counter = firstNumber;
        while (counter > 0) {
            System.out.println(counter);
            counter -= 1;
        }
        System.out.println("finished!");
    }

    public static int multiplyNumbersFromRange(int start, int finish) {
        var result = 1;
        var startValue = start;

        while (startValue <= finish) {
            result *= startValue;
            startValue += 1;
        }
        return result;
    }

    public static String joinNumbersFromRange(int start, int finish) {
        var result = "";
        var index = start;
        while (index <= finish)
        {
            result += index;
            index += 1;
        }
        return result;
    }

    public static void printReversedNameBySymbol(String name) {
        var startIndex = name.length() - 1;

        while (startIndex >= 0) {
            System.out.println(name.charAt(startIndex));
            startIndex -= 1;
        }
    }

    public static int countChars(String str, char ch) {
        int index = 0, count = 0;
        var lowerCh = Character.toLowerCase(ch);

        while (index < str.length()) {
            if (Character.toLowerCase(str.charAt(index)) == lowerCh) {
                count += 1;
            }
            index += 1;
        }

        return count;
    }

    public static String reverse(String str) {
        var result = "";
        var index = str.length() - 1;

        while (index >= 0) {
            result += str.charAt(index);
            index -= 1;
        }
        return result;
    }

    public static String filterString(String str, char ch) {
        var index = 0;
        var result = "";
        var lowerCh = Character.toLowerCase(ch);

        while (index < str.length()) {
            var letter = str.charAt(index);
            if (lowerCh != Character.toLowerCase(letter)) {
                result += letter;
            }
            index += 1;
        }
        return result;
    }

    public static String makeItFunny(String str, int n) {
        var index = 0;
        var result = "";

        while (index < str.length()) {
            var letter = str.charAt(index);
            if ((index + 1) % n == 0) {
                result += Character.toUpperCase(letter);
            } else {
                result += letter;
            }
            index += 1;
        }
        return result;
    }

    public static boolean hasChar(String str, char ch) {
        var index = 0;

        while (index < str.length()) {
            if (str.charAt(index) == ch) {
                return true;
            }
            index += 1;
        }
        return false;
    }

    public static String encrypt(String str) {
        var strLength = str.length();
        var result = "";
        for (var i = 0; i < strLength; i += 2) {
            var nextSymbol = i + 1 >= strLength ? "" : str.charAt(i + 1);
            result = result + nextSymbol + str.charAt(i);
        }
        return result;
    }
}
