// Write a method called monthApart that accepts four integer parameters, m1, d1, m2, and d2, representing two calendar dates.
// Each date consists of a month (1 through 12) and a day (1 through the number of days in that month[28-31]). Assume
// that all parameter values passed are valid. The method should return true if the dates are at least a month apart
// and false otherwise. 
public class Exercise17 {
    public static boolean monthApart(int m1, int d1, int m2, int d2) {
        return ((m1 < m2) && (d1 < d2)) || ((m2 < m1) && (d2 < d1));
    }

    public static void main(String[] args) {
        System.out.println(monthApart(4, 15, 5, 22));
        System.out.println(monthApart(9, 19, 10, 17));
    }
}
