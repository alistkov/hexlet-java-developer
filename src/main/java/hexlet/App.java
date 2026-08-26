package hexlet;

public class App {
    public static void main(String[] args) {
        var text1 = "yyab";
        System.out.println(ArraysTrack.countUniqChars(text1)); // 3

        var text2 = "You know nothing Jon Snow";
        System.out.println(ArraysTrack.countUniqChars(text2)); // 13

        var text3 = "";
        System.out.println(ArraysTrack.countUniqChars(text3)); // 0
    }
}
