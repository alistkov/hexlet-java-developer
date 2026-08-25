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
}
