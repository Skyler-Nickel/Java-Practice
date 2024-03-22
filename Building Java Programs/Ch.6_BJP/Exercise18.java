// Write a method called plusScores that accepts a Scanner representing an input file
// containing a series of lines that represents student records. Each student record
// takes up two lines of input. The first line has the student's name and the second
// line has a series of plus and minus characters.

import java.util.*;
import java.io.*;

public class Exercise18 {
    public static void plusScores(Scanner scan) {
        String name = "";
        int nameCount = 0;
        int scoreCount = 0;
        double score = 0.0;
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            if (!s.equals("")) {
                if (!s.contains("-") && !s.contains("+")) {
                    name = name(s);
                    nameCount++;
                }
                if (s.contains("+")) {
                    score = scores(s);
                    scoreCount++;
                }
            } else {
                System.out.println();
            }
            if ((nameCount == scoreCount) && (nameCount != 0)) {
                System.out.println(name + ": " + score + "% plus");
            }
        }
        System.out.println();
    }

    public static String name(String s) {
        return s;
    }

    public static double scores(String s) {
        double plus = 0.0;
        double total = (double) s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                plus++;
            }
        }
        return ((double) plus/ (double) total) * 100.0;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("exercise18.txt"));
        plusScores(scan);
        scan.close();
    }
}
