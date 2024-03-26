// Example from chapter 8 that implements a point object of a pair (x, y) coordinates.
// and uses encapsulation

public class Point {
    private int x;
    private int y;
    
    // Constructs a new point at the origin, (0, 0)
    public Point() {
        this(0, 0);
    }

    // Constructs a new point with the given (x, y) location
    public Point(int x, int y) {
        setLocation(x, y);
    }

    // returns the distance between this Point and (0, 0)
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // returns the x-coordinate of this point
    public int getX() {
        return x;
    }

    // returns the y-coordinate of this point
    public int getY() {
        return y;
    }

    // sets this point's (x, y) location to the given values
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    } 

    // returns a String representation of this point
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // shifts this point's location by the given amount
    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }

    // returns which quadrant of the x/y plane the current Point object falls in.
    public int quadrant() {
        if ((x == 0) || (y == 0)) {
            return 0;
        } else if ((x > 0) && (y > 0)) {
            return 1;
        } else if ((x < 0) && (y > 0)) {
            return 2;
        } else if ((x < 0) && (y < 0)) {
            return 3;
        } else {    // x is positive and y is negative
            return 4;
        }
    }

    // negates and swaps the x/y coordinates of the Point object.
    public void flip() {
        int temp = x;
        x = y * -1;
        y = temp * -1;
    }

    // Returns the "Manhattan distance" between the current Point object and given other Point object
    public int manhattanDistance(Point other) {
        return Math.abs((this.x - other.x) + (this.y - other.y));
    }

    // Returns true if the given Point lines up vertically with this Point
    // if their x-coordinates are the same
    public boolean isVertical(Point other) {
        return (this.x == other.x);
    }

    // Returns the slope of the line drawn between this Point and the given other Point.
    public double slope(Point other) {
        if (this.x == other.x) {
            throw new IllegalArgumentException();
        }
        double xSlope = (double) other.x - (double) this.x;
        double ySlope = (double) other.y - (double) this.y;
        return ySlope / xSlope;
    }

    // Returns whether this Point is collinear with the given two other Points.
    public boolean isCollinear(Point p1, Point p2) {
        
    }
}