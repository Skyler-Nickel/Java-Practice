// Write a method called printAverage that uses a sentinel loop to repeatedly prompt the user for numbers.
// Once the user types any number less than zero, the method should display the average of all nonnegative numbers typed.
// Display the average as a double.

import java.util.Scanner;

public class Exercise12 {
    public static void printAverage(Scanner console) {
        double average = 0.0;
        int count = -1;
        int stop = 0;
        
        while (stop >= 0) {
            average += stop;
            count++;
            System.out.print("Type a number: ");
            stop = console.nextInt();
        }
        average = (double) (average / count);
        
        if (average < 0 ) {
            return;
        }
        
        System.out.println("Average was " + average);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        printAverage(console);
        console.close();
    }
}
