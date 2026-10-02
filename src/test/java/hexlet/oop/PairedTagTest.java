package hexlet.oop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class PairedTagTest {
    @Test
    public void testPairedTag() {
        Map<String, String> attributes = new LinkedHashMap<>();
        attributes.put("class", "m-10");
        attributes.put("id", "10");
        attributes.put("lang", "en");

        // List<Tag> children = new ArrayList<>();

        Tag p = new PairedTag("p", attributes, "Text paragraph", new ArrayList<Tag>());
        String actual = p.toString();
        String expected = "<p class=\"m-10\" id=\"10\" lang=\"en\">Text paragraph</p>";
        assertEquals(expected, actual);
    }

    @Test
    public void TestEmptyPairedTag() {
        Map<String, String> attributes = new LinkedHashMap<>();
        Tag span = new PairedTag("span", attributes, "", new ArrayList<Tag>());
        String actual = span.toString();
        String expected = "<span></span>";
        assertEquals(expected, actual);
    }

    @Test
    void testPairedTagWithChildren() {
        Map<String, String> attributes = new LinkedHashMap<>();
        attributes.put("lang", "ru");
        attributes.put("id", "abc");

        List<Tag> children =
                List.of(
                        new SingleTag("br", Map.of("id", "s")),
                        new SingleTag("hr", Map.of("class", "a-5")));

        Tag div = new PairedTag("div", attributes, "", children);
        String actual = div.toString();
        String expected = "<div lang=\"ru\" id=\"abc\"><br id=\"s\"><hr class=\"a-5\"></div>";
        assertEquals(expected, actual);
    }
}
