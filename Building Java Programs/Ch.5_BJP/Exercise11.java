import java.util.*;

// Write a method called threeHeads that repeatedly flips a coin until the result of the coin toss are three heads in a
// row. You should use a Random object to make it equally likely that a head or a tail will appear. Each time the coin
// is flipped display H for heads or T for tails.
public class Exercise11 {
    public static void threeHeads() {
        Random rand = new Random();
        int numHeads = 0;
        while (numHeads < 3) {
            int flip = rand.nextInt(2);
            if (flip == 0) {
                System.out.print("T ");
                numHeads = 0;
            } else {
                System.out.print("H ");
                numHeads++;
            }
        }
        System.out.println();
        System.out.println("Three heads in a row!");
    }

    public static void main(String[] args) {
        threeHeads();
    }
}