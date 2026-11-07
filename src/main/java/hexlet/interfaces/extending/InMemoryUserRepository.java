package hexlet.interfaces.extending;

import java.util.*;

public class InMemoryUserRepository implements UserRepository {
    private Map<Long, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        users.put(user.id(), user);
    }

    @Override
    public void deleteById(long id) {
        users.remove(id);
    }

    @Override
    public Optional<User> findById(long id) {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }
}
