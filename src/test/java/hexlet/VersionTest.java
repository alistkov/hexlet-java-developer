package hexlet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VersionTest {
    private static List<Version> versions(String... texts) {
        var result = new ArrayList<Version>();
        for (var text : texts) {
            result.add(Version.parse(text));
        }
        return result;
    }

    @Test
    void majorDecidesFirst() {
        var older = Version.parse("1.99.99");
        var newer = Version.parse("2.0.0");
        assertEquals(1, newer.compareTo(older));
        assertEquals(-1, older.compareTo(newer));
    }

    @Test
    void minorComparesAsNumber() {
        var older = Version.parse("1.9.3");
        var newer = Version.parse("1.10.0");
        assertEquals(1, newer.compareTo(older));
        assertEquals(-1, older.compareTo(newer));
    }

    @Test
    void patchDecidesLast() {
        var older = Version.parse("1.2.3");
        var newer = Version.parse("1.2.10");
        assertEquals(1, newer.compareTo(older));
        assertEquals(-1, older.compareTo(newer));
    }

    @Test
    void equalVersionsGiveZero() {
        var first = Version.parse("3.1.4");
        var second = Version.parse("3.1.4");
        assertEquals(0, first.compareTo(second));
    }

    @Test
    void maxFindsNewest() {
        var list = versions("1.9.3", "1.10.0", "1.2.11", "1.10.0");
        assertEquals(Version.parse("1.10.0"), Collections.max(list));
    }
}
