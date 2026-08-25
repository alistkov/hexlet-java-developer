package hexlet;

public class App {
    public static void main(String[] args) {
        System.out.println(ConditionalStatements.whoIsThisHouseToStarks("Karstark")); // "friend"
        System.out.println(ConditionalStatements.whoIsThisHouseToStarks("Frey"));     // "enemy"
        System.out.println(ConditionalStatements.whoIsThisHouseToStarks("Joar"));     // "neutral"
        System.out.println(ConditionalStatements.whoIsThisHouseToStarks("Ivanov"));   // "neutral"
    }
}
