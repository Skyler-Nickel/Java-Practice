// Exercise 6:
// Write a recursive method called writeSquares that accepts an integer parameter n and then prints
// the first n squares separated by commas, with the odd squares in descending order followed by the even
// squares in ascending order.

public class Exercise6 {
    public static void main(String[] args) {
        writeSquares(8);
        System.out.println();
    }

    public static void writeSquares(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Please enter in a valid value.");
        }
        if (n == 1) {
            System.out.print(n);
        } else if (n % 2 != 0) {
            System.out.print(n*n +  ", ");
            writeSquares(n-1);
        } else {
            writeSquares(n-1);
            System.out.print(", " + n*n);
        }
    }
}
