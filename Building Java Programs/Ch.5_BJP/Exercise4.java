// Write a method called randomX that prints lines that contain a random number of "x"
// characters between 5 and 20 inclusive until it prints a line containing
// 16 or more characters.

import java.util.Random;

public class Exercise4 {
    public static void helper(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("x");
        }
        System.out.println();
    }

    public static void randomX() {
        Random rand = new Random();
        int number = rand.nextInt(5, 21);
        while (number < 16) {
            helper(number);
            number = rand.nextInt(5, 21);
        }
        helper(number);
    }

    public static void main(String[] args) {
        randomX();
    }
}
