// Write a method called season that takes as parameters two integers representing
// a month and day and returns a string indicating the season for that month and day
public class Exercise3 {
    public static String season(int month, int day) {
        if ((month < 1) || (month > 12)) {
            throw new IllegalArgumentException("You have entered an incorrect month");
        } else if ((day < 1) || (day > 31)) {
            throw new IllegalArgumentException("You have entered an incorrect day");
        }
        if (day >= 16) {
            if ((month >= 3) && (month <= 5)) {
                return "spring";
            } else if ((month >= 6) && (month <= 8)) {
                return "summer";
            } else if ((month >= 9) && (month <= 11)) {
                return "fall";
            } else {
                return "winter";
            }
        } else {
            if ((month >= 4) && (month <= 6)) {
                return "spring";
            } else if ((month >= 7) && (month <= 9)) {
                return "summer";
            } else if ((month >= 10) && (month <= 12)) {
                return "fall";
            } else {
                return "winter";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(season(3, 17));
        System.out.println(season(7, 4));
        System.out.println(season(11, 12));
        System.out.println(season(1, 12));
    }
}
