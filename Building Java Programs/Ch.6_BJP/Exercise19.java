// Write a method called leetSpeak that accepts two parameters: a Scanner representing
// an input file, and a PrintStream representing an output file. Convert the input
// file's text to "leet speak," where various letters are replaced by other letters/numbers,
// and output the new text to given output file. Replace "o" with "0", "l" (lowercase "L")
// with "1" (the number one), "e" with "3", "a" with "4", "t" with "7", and an "s"
// at the end of a word with "z". Preserve the original line breaks from the input. Also
// wrap each workd of input in parentheses.

import java.util.*;
import java.io.*;

public class Exercise19 {
    public static void leetSpeak(Scanner scan, PrintStream output) {
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            if (!s.equals("")) {
                leetSpeak(s, output);
            }
        }
    }

    public static void leetSpeak(String s, PrintStream output) {
        Scanner scan = new Scanner(s);
        while (scan.hasNext()) {
            String s2 = scan.next();
            output.print("(");
            if (s2.contains("o")) {
                s2 = s2.replace('o', '0');
            }
            if (s2.contains("l")) {
                s2 = s2.replace('l', '1');
            }
            if (s2.contains("e")) {
                s2 = s2.replace('e', '3');
            }
            if (s2.contains("a")) {
                s2 = s2.replace('a', '4');
            }
            if (s2.contains("t")) {
                s2 = s2.replace('t', '7');
            }
            if (s2.endsWith("s")) {
                s2 = s2.substring(0, s2.length()-1) + "z";
            }
            output.print(s2);
            output.print(") ");
        }
        output.println();
        scan.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("exercise19.txt"));
        PrintStream output = new PrintStream(new File("exercise19out.txt"));
        leetSpeak(scan, output);
        scan.close();
        output.close();
    }
}
