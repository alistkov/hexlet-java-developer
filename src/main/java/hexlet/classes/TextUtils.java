package hexlet.classes;

public class TextUtils {
    public static int getWordsCount(String text) {
        if (text.isEmpty()) {
            return 0;
        }

        var words = text.trim().split(" ");
        return words.length;
    }
}
