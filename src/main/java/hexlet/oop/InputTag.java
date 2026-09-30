package hexlet.oop;

public class InputTag implements TagInterface {
    public final String type;
    public final String value;

    public InputTag(String type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String render() {
        return String.format("<input type=\"%s\" value=\"%s\">", type, value);
    }
}
