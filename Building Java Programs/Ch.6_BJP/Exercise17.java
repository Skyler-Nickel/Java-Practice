// Write a method called inputStats that accepts a Scanner representing an input file
// and reports the number of lines, the longest line, the number of tokens on each line,
// and the length of the longest token on each line.

import java.util.*;
import java.io.*;

public class Exercise17 {
    public static void inputStats(Scanner scan) {
        int line = 0;
        String longestLine = "";
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            if (!s.equals("")) {
                line = inputStats(s, line);
            } else {
                System.out.println();
            }
            if (longestLine.length() < length(s)) {
                longestLine = s;
            }
        }
        System.out.println("Longest line: " + longestLine);
        System.out.println();
    }

    public static int inputStats(String s, int line) {
        Scanner scan = new Scanner(s);
        int token = 0;
        int longest = 0;
        while (scan.hasNext()) {
            String s2 = scan.next();
            token++;
            if (s2.length() > longest) {
                longest = s2.length();
            }
        }
        line++;
        System.out.println("Line " + line + " has " + token + " tokens (longest = " + longest + ")");
        scan.close();
        return line;
    }

    public static int length(String s) {
        return s.length();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("exercise17.txt"));
        inputStats(scan);
        scan.close();
    }
}
