// Write a method called mostCommonNames that accepts a Scanner representing an input
// file with names on each line separated by space. Some names appear multiple times in
// a row on the same line. For each line, print the most commonly occurring name.
// If there's a tie, use the first name that had that many occurrences; if all names are
// unique, print the first name on the line.

import java.util.*;
import java.io.*;

public class Exercise16 {
    public static void mostCommonNames(Scanner scan) {
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            mostCommonNames(s);
        }
        System.out.println();
    }

    public static void mostCommonNames(String s) {
        Scanner scan = new Scanner(s);
        String name = "";
        String token1 = "";
        int count = 1;
        int max = 1;

        if (scan.hasNext()) {
            token1 = scan.next();
        }

        while (scan.hasNext()) {
            String token2 = scan.next();
            if (token1.equals(token2)) {
                count++;
            } else {
                token1 = token2;
                count = 1;
            }
            if (count >= max) {
                name = token1;
                token1 = token2;
                max++;
            }
        }
        
        if (count > 1) {
            System.out.println("Most Common: " + name);
        } else {
            System.out.println();
        }
        scan.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("exercise16.txt"));
        mostCommonNames(scan);
        scan.close();
    }
}
