// Write a method called flipLines that accepts a Scanner for an input file and writes
// to the console the same file's contents with each pair of lines reversed in order.
// If the file contains an odd number of lines, leave the last line unmodified.

import java.io.*;
import java.util.*;

public class Exercise7 {
    public static void flipLines(Scanner scan) {
        String s1 = "";
        String s2 = "";
        while (scan.hasNextLine()) {
            s1 = scan.nextLine();
            if (scan.hasNextLine()) {
                s2 = scan.nextLine();
            }
            System.out.println(s2);
            System.out.println(s1);
            s1 = "";
            s2 = "";
        }
    }   
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("exercise7.txt"));
        flipLines(scan);
        scan.close();
    }
}
