package hexlet.oop;

import java.util.Map;
import java.util.stream.Collectors;

public class Tag {
    private final String tagName;
    private final Map<String, String> attributes;

    public Tag(String tagName, Map<String, String> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }

    protected String buildAttributes() {
        var entries = attributes.entrySet();
        return entries.stream()
                .map((entry) -> String.format(" %s=\"%s\"", entry.getKey(), entry.getValue()))
                .collect(Collectors.joining());
    }

    public String getName() {
        return tagName;
    }
}
