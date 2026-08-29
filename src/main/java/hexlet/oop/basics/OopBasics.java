package hexlet.oop.basics;

import java.util.Arrays;

public class OopBasics {
    public static double getSquare(int sideA, int sideB, int angle) {
        var radians = (angle * Math.PI) / 180;
        return  (sideA * sideB * Math.sin(radians)) / 2;
    }

    public static Point getNewPoint() {
        return new Point(5, 10);
    }

    public static String checkSecurity(Url url) {
        var protocol = url.getProtocol();
        var host = url.getHost();
        var secureText = protocol.equals("https") ? "is secure" : "is not secure";
        return "Connection to %s %s".formatted(host, secureText);
    }

    public static boolean hasDuplicates(String[] words) {
        var copy = Arrays.copyOf(words, words.length);
        Arrays.sort(copy);

       for (var i = 0; i < copy.length - 1; i += 1) {
           if (copy[i].equals(copy[i + 1])) {
               return true;
           }
       }
       return false;
    }

    public static Double calculateAverage(Integer[] numbers) {
        var length = numbers.length;

        if (length == 0) {
            return null;
        }

        var sum = 0.0;
        for (var number : numbers) {
            if (number == null) {
                return null;
            }
            sum += number;
        }

        return sum / length;
    }

    public static String getFigureSquare(Geometric figure) {
        var figureName = figure.getName();
        var square = figure.getSquare();
        return "Square of " + figureName + " is " + square;
    }

    public static void printSquare(Rectangle figure) {
        try {
            System.out.println(figure.getSquare());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
