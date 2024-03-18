// Write a method called evenSumMax that accepts a scanner for the console as a parameter
// The method should prompt the user for a number of integers, then prompt the integer
// that many times. Once the user has entered all the integers, the method should
// print the sum of all even numbers typed by the user. Along with the largest even
// number typed

import java.util.Scanner;

public class Exercise9 {
    public static void evenSumMax(Scanner scan) {
        System.out.print("How many integer? ");
        int amount = scan.nextInt();

        if (amount < 1) {
            throw new IllegalArgumentException("Please enter valid amount greater than 0.");
        }

        int evenSum = 0;
        int evenMax = Integer.MIN_VALUE;
        int temp;

        for (int i = 0; i < amount; i++) {
            System.out.print("Next integer? ");
            temp = scan.nextInt();
            
            if (temp % 2 == 0) {
                evenSum += temp;
                if (evenMax < temp) {
                    evenMax = temp;
                }
            }
        }

        System.out.println("Even sum = " + evenSum + ", Even max = " + evenMax);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        evenSumMax(console);
        console.close();
    }
}
