package hexlet;

import hexlet.lists.Exercises;
import hexlet.lists.model.User;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var user1 = new User("John");
        user1.addFriend(new User("Ellery"));

        var user2 = new User("Anna");
        user2.addFriend(new User("Abey"));

        // Общий друг двух пользователей
        var friend = new User("Jacky");
        user1.addFriend(friend);
        user2.addFriend(friend);

        List<User> commonFriends = Exercises.getCommonFriends(user1, user2);
        System.out.println(commonFriends); // => ["Jacky"]
    }
}
