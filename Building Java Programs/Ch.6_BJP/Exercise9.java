// Write a method called wordWrap that accepts a Scanner representing an input file
// as its parameter and outputs each line of the file to the console, word-wrapping
// all lines that are longer than 60 characters.

import java.io.*;
import java.util.*;

public class Exercise9 {
    public static void wordWrap(Scanner scan) {
        String s = "";
        String s2 = "";
        while (scan.hasNextLine()) {
            s = scan.nextLine();
            for (int i = 0; i < s.length();) {
                if (i+60 < s.length()) {
                    s2 = s.substring(i, i+60);
                } else {
                    s2 = s.substring(i, s.length());
                }
                i += 60;
                System.out.println(s2);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(new File("exercise9.txt"));
        wordWrap(scan);
        scan.close();
    }
}
