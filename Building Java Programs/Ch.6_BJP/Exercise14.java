// Write a method called printDuplicates that takes as a parameter a Scanner containing
// a series of lines. Your method should examine each line looking for consecutive occurences
// of the same token on the same line and print each duplicated token, along with the number
// of times that is appears consecutively. Non repeated tokens are not printed.

import java.util.*;
import java.io.*;

public class Exercise14 {
    public static void printDuplicates(Scanner scan) {
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            processString(s);
            System.out.println();
        }
    }

    public static void processString(String s) {
        Scanner scan = new Scanner(s);
        while (scan.hasNext()) {
            String token1 = scan.next();
            String token2 = "";
            int count = 0;
            if (scan.hasNext()) {
                token2 = scan.next();
                count++;
            }
            if (token1.equals(token2)) {
                count++;
                System.out.print(token1 + "*" + count + " ");
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("exercise14.txt"));
        printDuplicates(scan);
        scan.close();
    }
}
