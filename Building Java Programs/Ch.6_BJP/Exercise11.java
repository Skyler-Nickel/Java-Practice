// Modify the preceding wordWrap method so that it only wraps whole words, never chopping
// a word in half.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise11 {
    public static void wordWrap(Scanner scan) throws FileNotFoundException {
        String s = "";
        String s2 = "";
        String s3 = "";
        int count = 0;
        while (scan.hasNextLine()) {
            s = scan.nextLine();
            for (int i = 0; i < s.length();) {
                if (i+60 < s.length()) {
                    while (s.charAt(i+60) != ' ') {
                        i++;
                        count++;
                    }
                    s2 = s.substring(i-count, i+60);
                } else {
                    s2 = s.substring(i, s.length());
                }
                i += 60;
                count = 0;
                s3 += s2 + "\n";
            }
        }
        System.out.println(s3);
    }

    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(new File("exercise11.txt"));
        wordWrap(scan);
        scan.close();
    }
}
