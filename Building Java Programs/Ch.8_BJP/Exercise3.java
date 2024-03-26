// Implemented and tested in the PointExample folder as well
// Add the following mutator method to the Point class:

// public int manhattanDistance(Point other)

// Returns the "Manhattan distance" between the current Point object and the given
// other Point object. The Manhattan distance refers to the distance between two places
// if one can travel between them only by moving horizontally or vertically, as though
// driving on the streets of Manhattan. In our case the Manhattan distance is the sum
// of the absolute values of the differences in their coordinates; in other words,
// the differences in x plus the difference in y between the points.
public class Exercise3 {
    // Returns the "Manhattan distance" between the current Point object and given other Point object
    public int manhattanDistance(Point other) {
        return Math.abs((this.x - other.x) + (this.y - other.y));
    }
}
