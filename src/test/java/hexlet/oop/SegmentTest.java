package hexlet.oop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SegmentTest {
    @Test
    public void testSegment() {
        var beginPoint = new Point(2, 3);
        var endPoint = new Point(4, 7);
        var segment = new Segment(beginPoint, endPoint);
        var midPoint = segment.getMidPoint();

        assertEquals(beginPoint, segment.getBeginPoint());
        assertEquals(endPoint, segment.getEndPoint());

        assertEquals(3, midPoint.getX());
        assertEquals(5, midPoint.getY());
    }
}
