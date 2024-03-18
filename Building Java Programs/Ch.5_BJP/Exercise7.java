// Write a method called diceSum that accepts a scanner for the console as a parameter
// and prompts for a desired sum, then repeatedly simulates the rolling of 2 six-sided
// dice until their sum is the desired sum.

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
    public static void diceSum(Scanner console) {
        System.out.print("Desired dice sum: ");
        while (!console.hasNextInt()) {
            System.out.println("Not an integer, please try again.");
            console.next();
        }
        
        Random rand = new Random();
        int sum = console.nextInt();
        int d1 = rand.nextInt(1,7);
        int d2 = rand.nextInt(1,7);

        while ((d1 + d2) != sum) {
            System.out.println(d1 + " and " + d2 + " = " + (d1+d2));
            d1 = rand.nextInt(1,7);
            d2 = rand.nextInt(1,7);
        }
        System.out.println(d1 + " and " + d2 + " = " + (d1+d2));
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        diceSum(console);
        console.close();
    }
}
