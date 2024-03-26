// Implemented and tested in TimeSpanExample folder
// Add the following mutator method to the TimeSpan class:

// public void scale(int factor)

// Scales this time span by the given factor.

public class Exercise9 {
    // Scales this time span by the given factor.
    public void scale(int factor) {
        if (factor < 0) {
            throw new IllegalArgumentException();
        }
        totalMinutes *= factor;
    }
}
