// Write a method called pigLatin that accepts as a parameter a Scanner representing
// an input file. Your method should, preserving line breaks, print out the input file's
// text in a simplified version of Pig Latin, a silly English variant where the first
// letter of each word is moved to the end.

import java.util.*;
import java.io.*;

public class Exercise20 {
    public static void pigLatin(Scanner scan) {
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            pigLatin(s);
        }
    }

    public static void pigLatin(String s) {
        Scanner scan = new Scanner(s);
        while (scan.hasNext()) {
            String s2 = scan.next();
            if (s2.startsWith("a") || (s2.startsWith("e")) || (s2.startsWith("i"))
                        || (s2.startsWith("o")) || (s2.startsWith("u"))) {
                System.out.print(s2 + "yay ");
            } else {
                s2 = s2.substring(1, s2.length()) + s2.charAt(0) + "ay ";
                System.out.print(s2);
            }
        }
        System.out.println();
        scan.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("exercise20.txt"));
        pigLatin(scan);
        scan.close();
    }
}
