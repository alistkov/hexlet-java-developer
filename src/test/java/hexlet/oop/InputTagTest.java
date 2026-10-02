package hexlet.oop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

public class InputTagTest {
    @Test
    public void inputTagTest() throws Exception {
        var inputTag = new InputTag("submit", "Save");
        var expectedInput = readFixture("input.html");
        assertEquals(expectedInput, inputTag.render());
    }

    private static Path getFixturePath(String fileName) {
        return Paths.get("src", "test", "resources", "fixtures", fileName)
                .toAbsolutePath()
                .normalize();
    }

    private static String readFixture(String fileName) throws Exception {
        Path filePath = getFixturePath(fileName);
        return Files.readString(filePath).trim();
    }
}
