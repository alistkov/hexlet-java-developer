package hexlet.interfaces.extending;

public interface UserRepository extends UserReader {
    void save(User user);

    void deleteById(long id);
}
