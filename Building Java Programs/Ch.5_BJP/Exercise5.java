// Write a method called randomLines that prints between 5 and 10 random strings of
// letters (between "a" and "z"), one per line. Each string should have a random
// length of up to 80 characters

import java.util.Random;

public class Exercise5 {
    public static void randomLines() {
        Random rand = new Random();
        int numOfLines = rand.nextInt(5, 11);
        int numOfCharacters = 0;
        int helper = 0;
        char c;
        while (numOfLines > 0) {
            numOfCharacters = rand.nextInt(81);
            for (int i = 0; i < numOfCharacters; i++) {
                helper = rand.nextInt(97, 123);
                c = (char) helper;
                System.out.print(c); 
            }
            System.out.println();
            numOfLines--;
        }
    }
    
    public static void main(String[] args) {
        randomLines();
    }
}
