// Exercise 19:
// Modify the Point class from Chapter 8 so that it defines a natural ordering by implementing the
// Comparable interface. Compare the Points by y-major order; that is, points with smaller y-coordinate
// values should come before those with higher y-coordinate values. Break ties by comparing x-coordinate
// values.

import java.util.*;

public class Exercise19 {
    // Exercise will be done in the Point.java file
    public int compareTo(Point other) {
        if (this.y != other.y) {
            return this.y - other.y;
        }
        return this.x - other.x;
    }
}
