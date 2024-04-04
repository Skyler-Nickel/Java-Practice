// Write a recursive method called sumTo that accepts an integer parameter n and returns a real number
// representing the sum of the first n reciprocals.

public class Exercise9 {
    public static void main(String[] args) {
        System.out.println("The sum is " + sumTo(2));
        System.out.println("The sum is " + sumTo(3));
        System.out.println("The sum is " + sumTo(4));
    }
    
    public static double sumTo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Please enter a valid value.");
        }
        if (n == 0) {
            return 0.0;
        } else {
            return 1 + (1.0 / n-1) + sumTo(n-1);
        }
    }
}
