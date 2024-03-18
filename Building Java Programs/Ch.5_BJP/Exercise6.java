// Write a method called makeGuesses that guesses numbers between 1 and 50 inclusive
// until it makes a guess of at least 48. It should report the total number of guesses
// made.

import java.util.Random;

public class Exercise6 {
    public static void makeGuesses() {
        Random rand = new Random();
        int numOfGuesses = 1;
        int guess = rand.nextInt(51);
        while (guess < 48) {
            System.out.println("guess = " + guess);
            numOfGuesses++;
            guess = rand.nextInt(51);
        }
        System.out.println("guess = " + guess);
        System.out.println("total guesses = " + numOfGuesses);
    }

    public static void main(String[] args) {
        makeGuesses();
    }
}
