// Implemented and tested in PointExample folder
// Add the following accessor method to the Point class:

// public double slope(Point other)

// Returns the slope of the line drawn between this Point and the given other Point.
// Use the formula (y2 - y1)/(x2 - x1) to determine the slope between two points
// (x1, y1) and (x2, y2). Note that is formula fails for points with identical x-coordinates,
// so throw an IllegalArguementExeception in this case.

public class Exercise5 {
    // Returns the slope of the line drawn between this Point and the given other Point.
    public double slope(Point other) {
        if (this.x == other.x) {
            throw new IllegalArgumentException();
        }
        double xSlope = (double) other.x - (double) this.x;
        double ySlope = (double) other.y - (double) this.y;
        return ySlope / xSlope;
    }
}
