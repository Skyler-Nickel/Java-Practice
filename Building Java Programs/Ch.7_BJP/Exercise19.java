// Write a called wordLengths that accepts a scanner for an input file as its parameter.
// Your method should open the given file, count the number of letters in each token in
// the file, and output a result diagram of how many words contain each number of letters.

import java.util.*;
import java.io.*;

public class Exercise19 {
    public static void wordLengths(Scanner scan) {
        
    }   
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("exercise19.txt"));
        wordLengths(scan);
    }
}
