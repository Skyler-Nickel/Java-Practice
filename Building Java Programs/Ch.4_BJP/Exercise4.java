// Write a method called daysInMonth that takes a month(int) as a parameter and returns
// the number of days in that month in this year assume not leap year
public class Exercise4 {
    public static int daysInMonth(int month) {
        if ((month < 1) || (month > 12)) {
            throw new IllegalArgumentException("Not a valid month.");
        }

        if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
            return 30;
        } else if (month == 2) {
            return 28;
        }
        return 31;
    }

    public static void main(String[] args) {
        // Jan should return 31
        System.out.println("There are " + daysInMonth(1) + " days.");
        // Feb should return 28
        System.out.println("There are " + daysInMonth(2) + " days.");
        // Apr should return 30
        System.out.println("There are " + daysInMonth(4) + " days.");
    }
}
