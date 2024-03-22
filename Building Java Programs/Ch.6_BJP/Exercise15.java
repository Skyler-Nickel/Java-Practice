// Write a method called coinFlip that accepts a Scanner representing an input file
// of coin flips that are heads(H) or tails(T).

import java.util.*;
import java.io.*;

public class Exercise15 {
    public static void coinFlip(Scanner scan) {
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            coinFlip(s);
            if (s.equals("\n")) {
                System.out.println();
            }
        }
    }

    public static void coinFlip(String s) {
        Scanner scan = new Scanner(s);
        int heads = 0;
        int total = 0;
        
        while (scan.hasNext()) {
            String token = scan.next();
            if (token.equals(" ")) {
                System.out.println();
                break;
            }
            if (token.equals("h") || token.equals("H")) {
                heads++;
                total++;
            } else {
                total++;
            }
        }
        
        double result = ((double) heads / (double) total) * 100.0;
        
        if (heads > 0) {
            System.out.print( heads + " heads ("); 
            System.out.printf("%.1f", result);
            System.out.println(")");
            if (heads >= 3) {
                System.out.print("You win!");
                System.out.println();
            }
        }
        scan.close();
        System.out.println();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("exercise15.txt"));
        coinFlip(scan);
        scan.close();
    }
}
