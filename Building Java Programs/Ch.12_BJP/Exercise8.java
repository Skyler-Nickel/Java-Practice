// Write a recursive method called multiplyEvens that returns the product of the first n even integers.

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println("The product is " + multiplyEvens(1));
        System.out.println("The product is " + multiplyEvens(4));
    }

    public static int multiplyEvens(int n) {
        if (n <= 0 ) {
            throw new IllegalArgumentException("Please enter a valid value.");
        }
        if (n == 1) {
            return 2;
        } else {
            return (multiplyEvens(n-1) * 2) * n;
        }
    }
}
