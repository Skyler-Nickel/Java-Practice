// Write a method called readEntireFile that accepts a Scanner representing an input file
// as its parameter, then reads that file and returns its entire text contents as a String

import java.io.*;
import java.util.*;

public class Exercise6 {
    public static String readEntireFile(Scanner scan) {
        String s = "";
        if (scan.hasNextLine()) {
            s += scan.next();
            while (scan.hasNext()) {
                s += " " + scan.next();
            }
        }
        return s;
    }

    public static void main(String[] args) 
            throws FileNotFoundException {
        Scanner scan = new Scanner(new File("example.txt"));
        System.out.println(readEntireFile(scan));
        scan.close();
    }
}
