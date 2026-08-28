package hexlet;

import hexlet.oop.basics.OopBasics;
import hexlet.oop.basics.Url;

public class App {
    public static void main(String[] args) {
        var url1 = new Url("https://google.com");

       System.out.println(OopBasics.checkSecurity(url1)); // "Connection to google.com is secure"


        var url2 = new Url("http://example.com");

        System.out.println(OopBasics.checkSecurity(url2)); // "Connection to example.com is not secure"
    }
}
