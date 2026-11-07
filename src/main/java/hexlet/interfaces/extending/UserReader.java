package hexlet.interfaces.extending;

import java.util.List;
import java.util.Optional;

public interface UserReader {
    Optional<User> findById(long id);

    List<User> findAll();
}
