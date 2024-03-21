// Write a method called boyGirl that accepts a Scanner that is reading its input from
// a file containing a series of names followed by integers. The names alternate between
// boys' names and girls' names. Your method should compute the absolute difference
// between the sum of the boys' integers and sum of the girls' integers.

import java.util.Scanner;

public class Exercise1 {
    public static void boyGirl(Scanner scan) {
        int boys = 0;
        int girls = 0;
        int help1 = 0;
        int help2 = 0;
        int sum = 0;

        while (scan.hasNext()) {
        
            if (scan.hasNext()) {
                boys++;
                scan.next();
            }
        
            if (scan.hasNextInt()) {
                help1 += scan.nextInt();
            }
        
            if (scan.hasNext()) {
                girls++;
                scan.next();
            }
        
            if (scan.hasNextInt()) {
                help2 += scan.nextInt();
            }
        }
        
        sum = Math.abs(help1 - help2);
        
        System.out.println(boys + " boys, " + girls + " girls");
        System.out.println("Difference between boys' and girls' sums: " + sum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner("Erik 3 Rita 7 Tanner 14 Jillyn 13 Curtis 4 Stefanie 12 Ben 6");
        boyGirl(scan);
        scan.close();
    }
}