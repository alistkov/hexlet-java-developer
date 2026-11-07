package hexlet.interfaces.extending;

import java.util.Optional;

public class UserReportService {
    private final UserReader users;

    public UserReportService(UserReader users) {
        this.users = users;
    }

    public int countUsers() {
        return users.findAll().size();
    }

    public String describe(long id) {
        Optional<User> user = users.findById(id);
        if (user.isEmpty()) {
            return "Пользователь " + id + " не найден";
        }
        return "Пользователь " + id + ", " + user.get().name();
    }
}
