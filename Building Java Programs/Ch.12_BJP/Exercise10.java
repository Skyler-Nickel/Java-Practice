// Exercise 10:
// Write a recursive method called digitMatch that accepts two nonnegative integers as parameters and that
// returns the number of digits that match between them. Two digits match if they are equal and have the
// same position relative to the end of the number(i.e. starting with the ones digit). 

public class Exercise10 {
    public static void main(String[] args) {
        System.out.println(digitMatch(1072503891, 62530841));
        System.out.println(digitMatch(107, 621));
        System.out.println(digitMatch(7291, 6241));
        System.out.println(digitMatch(101, 41));
    }

    public static int digitMatch(int n1, int n2) {
        if (n1 < 0 || n2 < 0) {
            throw new IllegalArgumentException("Please enter valid values.");
        }
        if (n1 < 10 || n2 < 10) {
            return (n1 % 10 == n2 % 10) ? 1 : 0;
        } else if (n1 % 10 == n2 % 10) {
            return 1 + digitMatch(n1/10, n2/10);
        } else {
            return digitMatch(n1/10, n2/10);
        }
    }
}
