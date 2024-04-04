// Write a method called writeSequence that accepts an integer n as a parameter and prints to the console a
// symmetric sequence of n numbers composed of descending integers that ends in 1, followed by a sequence
// of ascending integers that begins with 1.

public class Exercise3 {
    public static void main(String[] args) {
        writeSequence(1);
        System.out.println();
        writeSequence(2);
        System.out.println();
        writeSequence(3);
        System.out.println();
        writeSequence(4);
        System.out.println();
        writeSequence(5);
        System.out.println();
        writeSequence(6);
        System.out.println();
        writeSequence(7);
        System.out.println();
        writeSequence(8);
        System.out.println();
        writeSequence(9);
        System.out.println();
        writeSequence(10);
        System.out.println();
    }

    public static void writeSequence(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Enter a valid value.");
        }
        if (n == 1) {
            System.out.print(n);
        } else if (n == 2) {
            System.out.print((n-1) + " " + (n-1));
        } else if (n % 2 != 0) {
            System.out.print(Math.round((double) n / 2.0) + " ");
            writeSequence(n-2);
            System.out.print(" " + Math.round((double) n / 2.0));
        } else {
            System.out.print((Math.round((double) n / 2.0)) + " ");
            writeSequence(n-2);
            System.out.print(" " + Math.round((double) n / 2.0));
        }
    }
}
