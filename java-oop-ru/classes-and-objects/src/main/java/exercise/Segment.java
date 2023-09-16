package exercise;

// BEGIN
public class Segment {
    private final Point start;
    private final Point end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getBeginPoint() {
        return start;
    }

    public Point getEndPoint() {
        return end;
    }

    public Point getMidPoint() {
        var numberOfPoints = 2;

        var x = (start.getX() + end.getX()) / numberOfPoints;
        var y = (start.getY() + end.getY()) / numberOfPoints;
        return new Point(x, y);
    }
}
// END
