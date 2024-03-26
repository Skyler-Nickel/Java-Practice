// Add the following accessor method to your Line

// public double getSlope()

// Returns the slope of this Line. The slope of a line between points (x1, y1) and (x2, y2)
// is equal to (y2-y1)/(x2-x1).

public class Exercise15 {
    // returns the slope of this line
    public double getSlope() {
        if (p1.x == p2.x) {
            throw new IllegalArgumentException();
        }
        double slopeY = (double) p2.y - (double) p1.y;
        double slopeX = (double) p2.x - (double) p1.x;
        return slopeY / slopeX;
    }
}
