// Implemented and tested in TimeSpanExample folder
// Add the following mutator method to the TimeSpan class:

// public void subtract(TimeSpan span)

// subtracts the given amount of time from this time span

public class Exercise8 {
    // Subtracts the given amount of time from this time span.
    public void subtract(TimeSpan span) {
        if ((this.totalMinutes - span.totalMinutes) < 0) {
            throw new IllegalArgumentException();
        }
        totalMinutes -= span.totalMinutes;
    }
}
