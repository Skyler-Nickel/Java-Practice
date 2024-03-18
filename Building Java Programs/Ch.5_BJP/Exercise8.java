// Write a method called randomWalk that performs steps of a random 
// one-dimensional walk. The random walk should begin at position 0.
// On each step, you should either increase or decrease the position by 1
// (each with equal probability). Your code should continue making steps until
// a position of 3 or -3 is reached, and then report the maximum position that was reached

import java.util.*;

public class Exercise8 {
    public static void randomWalk() {
        Random rand = new Random();
        int position = 0;
        int maxPos = 0;
        while ((position < 3) && (position > -3)) {
            position += rand.nextInt(1,2) * (rand.nextBoolean() ? -1 : 1);
            if (maxPos < position) {
                maxPos = position;
            }
            System.out.println("position = " + position);
        }
        System.out.println("max position = " + maxPos);
    }

    public static void main(String[] args) {
        randomWalk();
    }
}
