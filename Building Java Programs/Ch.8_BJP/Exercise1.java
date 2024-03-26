// This exercise is included in the Point class located in the PointExample folder

// Add the following accessor method to the Point class:

// public int quadrant()

// Returns which quadrant of the x/y plane the current object falls in.
// Quadrant 1 contains all points whose x and y values are both positive.
// Quadrant 2 contains all points with negative x but positive y. 
// Quadrant 3 contains all points with negative x and y values.
// Quadrant 4 contains all points with positive x but negative y.
// If the point lies directly on the x and/or y axis, return 0. 

public class Exercise1 {
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
}