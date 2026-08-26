package hexlet;

public class App {
    public static void main(String[] args) {
        var text1 = "When you play the game of thrones, you win or you die";
        String[] stopWords1 = {"die", "play"};
        var result1 = ArraysTrack.makeCensored(text1, stopWords1);
        System.out.println(result1);
    }
}
