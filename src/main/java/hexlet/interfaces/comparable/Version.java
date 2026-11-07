package hexlet.interfaces.comparable;

public record Version(int major, int minor, int patch) implements Comparable<Version> {
    public static Version parse(String text) {
        var parts = text.split("\\.");
        return new Version(
                Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
    }

    @Override
    public String toString() {
        return major + "." + minor + "." + patch;
    }

    // BEGIN (write your solution here)
    @Override
    public int compareTo(Version other) {
        if (major != other.major) {
            return Integer.compare(major, other.major);
        }
        if (minor != other.minor) {
            return Integer.compare(minor, other.minor);
        }
        return Integer.compare(patch, other.patch);
    }
    // END
}
