package hexlet.oop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class SingleTagTest {
    @Test
    public void testSingleTag() {
        Map<String, String> attributes = new LinkedHashMap<>();
        attributes.put("class", "w-75");
        attributes.put("id", "wop");
        Tag img = new SingleTag("img", attributes);
        String actual = img.toString();
        String expected = "<img class=\"w-75\" id=\"wop\">";
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleTagWithoutAttributes() {
        Map<String, String> attributes = new LinkedHashMap<>();
        Tag hr = new SingleTag("hr", attributes);
        String actual = hr.toString();
        String expected = "<hr>";
        assertEquals(expected, actual);
    }
}
