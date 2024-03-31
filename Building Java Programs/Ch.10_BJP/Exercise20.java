// Exercise 20:
// Modify the TimeSpan class from Chapter 8 to include a compareTo method that compares time spans by their
// length. A time span that represents a shorter amount of time is considered to be "less than" one that
// represents a longer amount of time.

public class Exercise20 {
    // This exercise will be implemented in TimeSpan.java
    public int compareTo(TimeSpan span) {
        return this.totalMinutes - span.totalMinutes;
    }
}
