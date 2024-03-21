// Write a method called collapseSpaces that accepts a Scanner representing an input file
// as its parameter, then reads that file and outputs it with all its tokens separated
// by single spaces, collapsing any sequences of multiple spaces into single spaces.

import java.util.Scanner;

public class Exercise5 {
    public static void collapseSpaces(Scanner scan) {
        if (scan.hasNext()) {
            System.out.print(scan.next());
            while (scan.hasNext()) {
                System.out.print(" " + scan.next());
            }        
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner("  many   spaces    on   this    line!");
        collapseSpaces(scan);
        scan.close();
    }
}
