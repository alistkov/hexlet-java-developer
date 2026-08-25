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
}
