// Implemented and tested in LineExample folder
// Add the following accessor method to your Line class:

// public boolean isCollinear(Point p)

// returns true if given Point is collinear with the Points of this Line

public class Exercise17 {
    // returns true if given Point is collinear with the Points of this Line
    public boolean isCollinear(Point p) {
        if ((p1.x == p2.x) || (p2.x == p.x) || (p.x == p1.x)) {
            throw new IllegalArgumentException();
        }
        double slope1 = this.getSlope();
        double slope2X = (double) p.x - (double) p2.x;
        double slope2Y = (double) p.y - (double) p2.y;
        double slope2 = slope2X / slope2Y;
        return Math.abs(slope1 - slope2) < 0.001;
    }
}
