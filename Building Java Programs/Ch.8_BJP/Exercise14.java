// Write a class called Line that represents a line segment between two Points. Your
// Line object should have the following methods:

// Constructs a new Line that contains the given two Points.
// public Line(Point p1, Point p2)

// Returns this Line's first endpoint.
// public Point getP1()

// Returns this Line's second endpoint
// public Point getP2()

// Returns a String representation of this Line, such as "[(22, 3), (4, 7)]"
// public String toString()

public class Exercise14 {
    private Point p1;
    private Point p2;

    public Line() {
        this(0,0,0,0);
    }

    public Line(int p1X, int p1Y, int p2X, int p2Y) {
        this.p1 = new Point(p1X, p1Y);
        this.p2 = new Point(p2X, p2Y);
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String toString() {
        return "[" + "(" + p1.x + ", " + p1.y + "), ("+ p2.x + ", " + p2.y + ")" + "]";
    }
}
