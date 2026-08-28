package hexlet.oop.basics;

public class Url {
    private final String url;

    public Url(String url) {
        this.url = url;
    }

    public String getProtocol() {
        return url.split("://")[0];
    }

    public String getHost() {
        return url.split("://")[1];
    }
}
