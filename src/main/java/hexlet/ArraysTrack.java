package hexlet;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class ArraysTrack {
    public static String[] getWeekends(String format) {
        return format.equalsIgnoreCase("short")
                ? new String[]{"sat", "sun"}
                : new String[]{"saturday", "sunday"};
    }

    public static void swap(int[] numbers) {
        if (numbers.length < 2) {
            return;
        }

        var lastIndex = numbers.length - 1;
        var first = numbers[0];
        var last = numbers[lastIndex];
        numbers[0] = last;
        numbers[lastIndex] = first;
    }

    public static String[] addPrefix(String[] names, String prefix) {
        var result = new String[names.length];

        for (var i = 0; i < names.length; i += 1) {
            result[i] = prefix + " " + names[i];
        }
        return result;
    }

    public static int calculateSum(int[] numbers) {
        var sum = 0;

        for (var i = 0; i < numbers.length; i += 1) {
            if (numbers[i] % 3 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }

    public static int mult(int[] numbers) {
        var result = 1;
        for (var number: numbers) {
            result *= number;
        }
        return result;
    }

    public static int[] getSameParity(int[] numbers) {
        if (numbers.length == 0) {
            return new int[0];
        }

        var result = new int[numbers.length];
        var count = 0;
        var isFirstElementEven = Math.abs(numbers[0]) % 2 == 0;

        for (var number : numbers) {
            if (isFirstElementEven == (Math.abs(number) % 2 == 0)) {
                result[count] = number;
                count += 1;
            }
        }
        return Arrays.copyOfRange(result, 0 , count);
    }

    public static int getTotalAmount(String[] wallet, String currency) {
        var sum = 0;

        for (var amount: wallet) {
            var currentCurrency = amount.substring(0, 3);
            var currentAmount = amount.substring(4);
            if (!currentCurrency.equals(currency)) {
                continue;
            }
            sum += Integer.parseInt(currentAmount);
        }
        return sum;
    }

    public static String getSuperSeriesWinner(int[][] scores) {
        var result = 0;

        for (var score : scores) {
            result = Integer.signum(score[0] - score[1]);
        }
        if (result > 0) {
            return "canada";
        }
        if (result < 0) {
            return "ussr";
        }
        return "draw";
    }

    public static String buildDefinitionList(String[][] definitions) {
        if (definitions.length == 0) {
            return "";
        }

        var html = new StringBuilder();
        html.append("<dl>");
        for (var definition : definitions) {
            var name = definition[0];
            var description = definition[1];
            html.append("<dt>");
            html.append(name);
            html.append("</dt>");
            html.append("<dd>");
            html.append(description);
            html.append("</dd>");
        }
        html.append("</dl>");
        return html.toString();
    }

    public static String makeCensored(String text, String[] stopWords) {
        var words = text.split(" ");
        for (var i = 0; i < words.length; i += 1) {
            var word = words[i];
            var newWord = ArrayUtils.contains(stopWords, word) ? "$#%!" : word;
            words[i] = newWord;
        }
        return String.join(" ", words);
    }

    public static int getSameCount(int[] array1, int[] array2) {
        var uniqArray1 = uniq(array1);
        var uniqArray2 = uniq(array2);
        var count = 0;

        for (var i : uniqArray1) {
            for (var j : uniqArray2) {
                if (i == j) {
                    count += 1;
                }
            }
        }
        return count;
    }

    public static int countUniqChars(String text) {
        var chars = text.toCharArray();
        var count = 0;
        var uniq = new Character[chars.length];

        for (var ch : chars) {
            if (!ArrayUtils.contains(uniq, ch)) {
                uniq[count] = ch;
                count += 1;
            }
        }
        return Arrays.copyOfRange(uniq, 0, count).length;
    }

    public static void bubbleSort(int[] numbers) {
        var steps = numbers.length - 1;
        boolean swapped;

        do {
            swapped = false;
            for (var i = 0; i < steps; i += 1) {
                if (numbers[i] > numbers[i + 1]) {
                    var tmp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tmp;
                    swapped = true;
                }
            }
            steps -= 1;
        } while (swapped);
    }

    private static int[] uniq(int[] coll) {
        return Arrays.stream(coll).distinct().toArray();
    }
}
