package hexlet.interfaces.extending;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {
    @Test
    public void repositoryExtendsReaderTest() {
        assertTrue(UserRepository.class.isInterface());
        assertTrue(List.of(UserRepository.class.getInterfaces()).contains(UserReader.class));
    }

    @Test
    public void inMemoryRepositoryImplementsRepositoryTest() {
        assertInstanceOf(UserRepository.class, new InMemoryUserRepository());
    }

    @Test
    public void emptyRepositoryTest() {
        var repository = new InMemoryUserRepository();
        assertTrue(repository.findAll().isEmpty());
        assertTrue(repository.findById(1).isEmpty());
    }

    @Test
    public void savedUserIsFoundTest() {
        var repository = new InMemoryUserRepository();
        var john = new User(1, "John Doe");
        var sam = new User(2, "Sam Smith");
        repository.save(john);
        repository.save(sam);

        var expectedUser = repository.findById(1);

        assertTrue(expectedUser.isPresent());
        assertEquals(john, expectedUser.get());
        assertTrue(repository.findById(3).isEmpty());
        assertEquals(
                Set.of(john, sam),
                Set.copyOf(repository.findAll())
        );
    }

    @Test
    void saveWithSameIdReplacesUserTest() {
        var repository = new InMemoryUserRepository();
        repository.save(new User(1, "John"));
        repository.save(new User(1, "Sam"));

        assertEquals(1, repository.findAll().size());

        var expectedUser = repository.findById(1);
        assertTrue(expectedUser.isPresent());
        assertEquals(new User(1, "Sam"), expectedUser.get());
    }

    @Test
    void deleteByIdTest() {
        var repository = new InMemoryUserRepository();
        repository.save(new User(1, "John"));
        repository.save(new User(2, "Sam"));
        repository.deleteById(1);
        repository.deleteById(42);

        assertTrue(repository.findById(1).isEmpty());
        assertEquals(
                List.of(new User(2, "Sam")),
                repository.findAll()
        );
    }

    @Test
    void repositoryWorksWithReportServiceTest() {
        var repository = new InMemoryUserRepository();
        repository.save(new User(1, "John"));
        repository.save(new User(2, "Sam"));

        var reports = new UserReportService(repository);
        assertEquals(2, reports.countUsers());
        assertEquals("Пользователь 2, Sam", reports.describe(2));
        assertEquals("Пользователь 7 не найден", reports.describe(7));
    }
}
