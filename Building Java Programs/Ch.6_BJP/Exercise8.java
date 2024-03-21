// Write a method called doubleSpace that accepts a Scanner for an input file and a PrintStream
// for an output file as its parameters, writing into the output file a double-spaced
// version of text in the input file.

import java.util.*;
import java.io.*;

public class Exercise8 {
    public static void doubleSpaced(Scanner scan, PrintStream output) {
        String s = "";
        while (scan.hasNextLine()) {
            s = scan.nextLine();
            output.println(s);
            output.println();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("exercise8.txt")); 
        PrintStream output = new PrintStream(new File("exercise8out.txt"));
        doubleSpaced(scan, output);
        scan.close();
        output.close();
    }
}
