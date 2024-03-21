// Write a method called negativeSum that accepts a Scanner reading input from a file
// containing a series of integers, and print a message to the console indicating whether
// the sum starting from the first number is ever negative.

import java.util.Scanner;

public class Exercise3 {
    public static boolean negativeSum(Scanner scan) {
        int sum = 0;
        int steps = 0;
        
        while (scan.hasNextInt()) {
            sum += scan.nextInt();
            steps++;
            if (sum < 0) {
                System.out.println("sum of " + sum + " after " + steps + " steps");
                return true;
            }
        }
        
        System.out.println("no negative sum");
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner("38 4 19 -27 -15 -3 4 19 38");
        negativeSum(scan);
        scan.close();
        Scanner scan1 = new Scanner ("14 7 -10 9 -18 -10 17 42 98");
        negativeSum(scan1);
        scan1.close();
    }
}
