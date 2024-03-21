// Write a method called stripComments that accepts a Scanner representing an input file
// containing Java program as its parameter, read that file, and then prints the file's
// text with all comments removed.

import java.util.*;
import java.io.*;

public class Exercise13 {
    public static void stripComments(Scanner scan) {
        String s = "";
        String s2 = "";
        while (scan.hasNextLine()) {
            s = scan.nextLine();
            if (!s.startsWith("/*")) {
                if (!s.contains("/*") && s.endsWith("*/")) {
                    s2 = "";
                } else if (s.contains("/*") && s.contains("*/")) {
                    s2 = s.substring(0, s.indexOf("/*")) + s.substring(s.indexOf("*/") + 2);
                } else if (s.contains("//")) {
                    s2 = s.substring(0, s.indexOf("//"));
                } else {
                    s2 = s;
                }
            System.out.println(s2);
            s2 = "";
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("exercise13.txt"));
        stripComments(scan);
        scan.close();
    }
}
