package hexlet.classes;

public class Book {
    private final String title;
    private final String author;
    private final int published;

    public Book(String title, String author, int published) {
        this.title = title;
        this.author = author;
        this.published = published;
    }

    @Override
    public String toString() {
        return "Book \"" + title + "\" written by " + author + " published in " + published;
    }
}
