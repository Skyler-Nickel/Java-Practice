// Exercise 12:
// add an equals method to the TimeSpan class introduced in Chapter 8. Two time spans
// are considered equal if they represent the same number of hours and minutes.

public class TimeSpan {
    private int totalMinutes;

    // Constructs a time span with the given interval.
    // pre: hours >= 0 && minutes >= 0
    public TimeSpan(int hours, int minutes) {
        totalMinutes = 0;
        add(hours, minutes);
    }

    // Adds the given interval to this time span.
    // pre: hours >= 0 && minutes >= 0
    public void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            throw new IllegalArgumentException();
        }
        totalMinutes += 60 * hours + minutes;
    }

    // returns a String for this time span, such as "6h 15m"
    public String toString() {
        return (totalMinutes / 60) + "h " + (totalMinutes % 60) + "m";
    }

    // Adds the given amount of time to this time span
    public void add(TimeSpan span) {
        totalMinutes += span.totalMinutes;
    }

    // Subtracts the given amount of time from this time span.
    public void subtract(TimeSpan span) {
        if ((this.totalMinutes - span.totalMinutes) < 0) {
            throw new IllegalArgumentException();
        }
        totalMinutes -= span.totalMinutes;
    }

    // Scales this time span by the given factor.
    public void scale(int factor) {
        if (factor < 0) {
            throw new IllegalArgumentException();
        }
        totalMinutes *= factor;
    }

    // equals method
    public boolean equals(Object o) {
        if (o instanceof TimeSpan) {
            TimeSpan t = (TimeSpan) o;
            return totalMinutes == t.totalMinutes;
        }
        return false;
    }
}
