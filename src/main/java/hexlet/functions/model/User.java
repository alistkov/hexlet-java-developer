package hexlet.functions.model;

import java.time.LocalDate;

public final class User {
    private final String name;
    private final LocalDate birthday;

    public User(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User(name=" + name + ", birthday=" + birthday + ")";
    }
}
