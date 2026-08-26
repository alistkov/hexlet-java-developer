package hexlet;

public class App {
    public static void main(String[] args) {
        String[][] definitions = {
                {"Блямба", "Выпуклость, утолщения на поверхности чего-либо"},
                {"Бобр", "Животное из отряда грызунов"},
        };

        System.out.println(ArraysTrack.buildDefinitionList(definitions));
    }
}
