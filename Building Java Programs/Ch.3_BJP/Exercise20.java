// Write a method called inputBirthday that accepts a scanner for the console
// as a parameter and prompts the user to enter a month, day, and year then prints

import java.util.Scanner;

public class Exercise20 {
    public static void inputBirthday(Scanner scan) {
        System.out.print("On what day of the month were you born? ");
        int day = scan.nextInt();
        System.out.print("What is the name of the month in which you were born? ");
        String month = scan.next();
        System.out.print("During what year were you born? ");
        int year = scan.nextInt();
        System.out.println("You were born on " + month + day + ", " + 
                            year + ". You\'re mighty old!");
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        inputBirthday(console);
        console.close();
    }
    
}
