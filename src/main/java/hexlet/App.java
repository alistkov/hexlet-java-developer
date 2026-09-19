package hexlet;

import hexlet.maps.Exercise;

public class App {
    public static void main(String[] args) {
        var text = "java and javascript are different languages";

        var index = Exercise.buildIndex(text);
        System.out.println(index); // => {a=[and, are], d=[different], j=[java, javascript], l=[languages]}

        var index2 = Exercise.buildIndex("");
        System.out.println(index2); // => {}
    }
}
