package hexlet.oop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

public class LabelTagTest {
    @Test
    public void testLabelTag() throws Exception {
        var label = new LabelTag("Press Submit", new InputTag("submit", "Save"));
        var expectedInput = readFixture("label.html");
        assertEquals(expectedInput, label.render());
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
