// Write a method called evenNumbers that accepts a Scanner reading input from a file
// with a series of integers, and report various statistics about the integers to the
// console. Report the total number of numbers, the sum of the numbers, the count of even
// numbers and the percent of even numbers.

import java.util.Scanner;

public class Exercise2 {
    public static void evenNumbers(Scanner scan) {
        int total = 0;
        int sum = 0;
        int even = 0;
        double percent = 0;
        int temp = 0;
        while (scan.hasNextInt()) {
            temp = scan.nextInt();
            total++;
            sum += temp;
            if (temp % 2 == 0) {
                even++;
            }
        }
        percent = (double) ((double) even / (double) total) * 100;
        percent = Math.round(percent * 100.0) / 100.0;

        System.out.println(total + " numbers, sum = " + sum);
        System.out.println(even + " evens (" + percent + "%)");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner("5 7 2 8 9 10 12 98 7 14 20 22");
        evenNumbers(scan);
        scan.close();
    }
}
