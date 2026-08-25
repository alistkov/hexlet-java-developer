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
}
