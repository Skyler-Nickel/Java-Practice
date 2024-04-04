// Exercise 2:
// Write a method called writeNums that takes an integer n as a parameter and prints to the console the
// first n integers starting with 1 in sequential order, seperated by commas.

public class Exercise2 {
    public static void main(String[] args) {
        writeNums(5);
        System.out.println();
        writeNums(12);
        System.out.println();
    }

    public static void writeNums(int n) {
        if (n == 1) {
            System.out.print(n);
        } else {
            writeNums(n-1);
            System.out.print(", ");
            System.out.print(n);
        }
    }
}
