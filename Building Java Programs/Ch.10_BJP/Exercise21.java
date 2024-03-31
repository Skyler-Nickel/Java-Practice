// Exercise 21:
// Modify the CalendarDate class from this chapter to include a year field, and modify its compareTo method
// to take years into account when making comparisons. Years take precedence over months, which take precedence
// over days.

public class Exercise21 {
    // This exercise will be implemented in CalendarDate.java
    public int compareTo(CalendarDate other) {
        if (this.year != other.year) {
            return this.year - other.year;
        } else if (month != other.month) {
            return month - other.month;
        }
        return day - other.day;
    }
}
