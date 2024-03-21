// Write a method called stripHtmlTags that accepts a Scanner representing an input file
// containing an HTML web page as its parameters, then reads that file's text with all
// HTML tags removed.

import java.io.*;
import java.util.*;

public class Exercise12 {
    public static void stripHtmlTags(Scanner scan) {
        String s = "";
        String s2 = "";
        char c;
        while (scan.hasNextLine()) {
            s = scan.nextLine();
            if (s.length() != 0) {
                for (int i = 0; i < s.length(); i++) {
                    c = s.charAt(i);
                    if (c == '<') {
                        while (s.charAt(i) != '>') {
                            i++;
                        }
                        if (i+1 < s.length()) {
                            i++;
                            c = s.charAt(i);
                        } else {
                            c = '\0';
                        }
                    }
                    s2 += c;
                }
            } else {
                s2 += s;
            }
            
            System.out.println(s2);
            s2 = "";
            
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("exercise12.txt"));
        stripHtmlTags(scan);
        scan.close();
    }
}
