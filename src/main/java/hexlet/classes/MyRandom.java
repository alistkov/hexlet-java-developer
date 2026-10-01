package hexlet.classes;

import java.util.Random;

public class MyRandom {
    private static final int MIN_RANDOM_VALUE = 1;
    private static final int MAX_RANDOM_VALUE = 100;

    public static int generate() {
        return new Random().nextInt(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE + 1);
    }
}
