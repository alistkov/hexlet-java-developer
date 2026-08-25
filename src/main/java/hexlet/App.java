package hexlet;

public class App {
    public static void main(String[] args) {
        System.out.println(Loops.reverse("HexlEt"));

        var str = "If I look back I am lost";
        System.out.println(Loops.filterString(str, 'I')); // "f  look back  am lost"
        System.out.println(Loops.filterString(str, 'o')); // "If I lk back I am lst"
    }
}
