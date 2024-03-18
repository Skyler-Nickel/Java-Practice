// Write a method called printGPA that accepts a scanner for the console as parameter
// and calculates a student's grade point average. The user will type a line of input
// containing the student's name, then a number that represents the number of scores 

import java.util.Scanner;

public class Exercise10 {
    public static void printGPA(Scanner scan) {
        System.out.print("Enter a student record: ");
        
        String student = scan.next();
        int amount = scan.nextInt();
        double gpa = 0;

        for (int i = 0; i < amount; i++) {
            int temp = scan.nextInt();
            gpa += temp;
        }

        gpa /= (double) amount;

        System.out.println(student + "\'s grade is " + gpa);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        printGPA(console);
        printGPA(console);
        console.close();
    }
}
