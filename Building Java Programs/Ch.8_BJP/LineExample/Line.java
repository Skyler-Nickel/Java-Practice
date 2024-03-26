// implements a line class

import java.awt.*;

public class Line {
    private Point p1;
    private Point p2;


    // constructor using two points
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Constructs a line accepting 4 int values for p1 and p2
    public Line(int x1, int y1, int x2, int y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    // returns p1
    public Point getP1() {
        return p1;
    }

    // returns p2
    public Point getP2() {
        return p2;
    }

    // returns a string representatio of p1 and p2
    public String toString() {
        return "[" + "(" + p1.x + ", " + p1.y + "), ("+ p2.x + ", " + p2.y + ")" + "]";
    }

    // returns the slope of this line
    public double getSlope() {
        if (p1.x == p2.x) {
            throw new IllegalArgumentException();
        }
        double slopeY = (double) p2.y - (double) p1.y;
        double slopeX = (double) p2.x - (double) p1.x;
        return slopeY / slopeX;
    }

    // returns true if given Point is collinear with the Points of this Line
    public boolean isCollinear(Point p) {

    }
    
}
