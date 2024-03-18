// Write a method called smallestLargest that accepts a scanner for the console
// as a parameter and asks the user to enter numbers. Then prints the smallest and largest

import java.util.Scanner;

public class Exercise8 {
    public static void smallestLargest(Scanner scan) {
        System.out.print("How many numbers do you want to enter? ");
        int amount = scan.nextInt();
        System.out.println();
        
        if (amount < 1) {
            throw new IllegalArgumentException("Please enter a valid number greater than 0.");
        }

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int temp;

        for (int i = 1; i <= amount; i++) {
            System.out.print("Number " + i + ": ");
            temp = scan.nextInt();
            
            if (smallest > temp) {
                smallest = temp;
            } else if (largest < temp) {
                largest = temp;
            }
        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        smallestLargest(console);
        console.close();
    }
}
