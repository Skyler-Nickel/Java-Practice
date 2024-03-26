// The following method is also implemented and tested in PointExample folder
// Add the following accessor method to the Point class:

// public boolean isVertical(Point other)

// Returns true if the given Point lines up vertically with this Point, that is,
// if their x-coordinates are the same. 

public class Exercise4 {
    // Returns true if the given Point lines up vertically with this Point
    // if their x-coordinates are the same
    public boolean isVertical(Point other) {
        return (this.x == other.x);
    }
}
