// The following exercise is also implemented and tested in PointExample folder
// Add the following mutator method to the Point class:

// public void flip()

// Negates and swaps the x/y coordinates of the Point object. For example, if an
// object pt initially represents the point(5, -3), after a call of pt.flip(); the
// object should represent (3, -5). If the same object initially represents the point
// (4, 17), after a call to pt.flip(); the object should represent (-17, -4).

public class Exercise2 {
    // negates and swaps the x/y coordinates of the Point object.
    public void flip() {
        int temp = x;
        x = y * -1;
        y = temp * -1;
    }
}
