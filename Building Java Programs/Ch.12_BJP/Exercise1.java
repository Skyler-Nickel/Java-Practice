// Exercise 1:
// Write a a recursive method called starString that accepts an integer as a parameter and prints
// to the console a string of stars (astericks) that is 2^n long.

public class Exercise1 {
    public static void main(String[] args) {
        starString(0);
        System.out.println();
        starString(1);
        System.out.println();
        starString(2);
        System.out.println();
        starString(3);
        System.out.println();
        starString(4);
        System.out.println();
    }

    public static void starString(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Enter a valid value.");
        }
        if (n == 0) {
            System.out.print("*");
        } else {
            starString(n-1);
            starString(n-1);
        }
    }
}