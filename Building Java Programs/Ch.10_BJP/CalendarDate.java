// Example provided in the book

// The CalendarDate class stores information about a single
// calendar date (month and day but no year)

public class CalendarDate implements Comparable<CalendarDate> {
    private int year;
    private int month;
    private int day;

    public CalendarDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Compare this calendar date to another date.
    // Dates are compared by month and then by day.
    public int compareTo(CalendarDate other) {
        if (this.year != other.year) {
            return this.year - other.year;
        } else if (month != other.month) {
            return month - other.month;
        }
        return day - other.day;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return month + "/" + day;
    }
}
