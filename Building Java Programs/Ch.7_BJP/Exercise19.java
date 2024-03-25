// Write a called wordLengths that accepts a scanner for an input file as its parameter.
// Your method should open the given file, count the number of letters in each token in
// the file, and output a result diagram of how many words contain each number of letters.

import java.util.*;
import java.io.*;

public class Exercise19 {
    public static void wordLengths(Scanner scan) {
        int[] arr = getCharLength(scan);
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] > 0) || (i < 8)) {
                System.out.print(i + ": " + arr[i]);
                printChar(arr[i]);
            }
        }
    }   
    
    public static int[] getCharLength(Scanner scan) {
        int[] arr = new int[81];
        while (scan.hasNext()) {
            String token = scan.next();
            arr[token.length()]++;
        }
        return arr;
    }

    public static void printChar(int amount) {
        System.out.print(" ");
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("exercise19.txt"));
        wordLengths(scan);
    }
}
