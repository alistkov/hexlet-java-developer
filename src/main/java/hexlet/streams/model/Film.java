package hexlet.streams.model;

import java.util.List;

public class Film {
    private final String name;
    private final List<String> genres;

    public Film(String name, List<String> genres) {
        this.name = name;
        this.genres = genres;
    }

    public String getName() {
        return name;
    }

    public List<String> getGenres() {
        return genres;
    }
}
