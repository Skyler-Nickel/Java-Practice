// Exercise 8:
// Write a method called isPalindrome that accepts a queue of integers as a parameter and returns true
// if the numbers in the queue are the same in reverse order. Use one stack as auxiliary storage.

import java.util.*;

public class Exercise8 {
    public static void main(String[] args) {
        int[] data = {3, 8, 17, 9, 17, 8, 3};
        Queue<Integer> q = new LinkedList<>();

        for (int i: data) {
            q.add(i);
        }
        System.out.println("The queue before isPalindrome = " + q);
        System.out.println(isPalindrome(q));
        System.out.println("The queue after isPalindrome = " + q);
        System.out.println();

        int[] data2 = {3, 17, 9, 4, 17, 3};
        Queue<Integer> q2 = new LinkedList<>();

        for (int i: data2) {
            q2.add(i);
        }
        System.out.println("The queue before isPalindrome = " + q2);
        System.out.println(isPalindrome(q2));
        System.out.println("The queue after isPalindrome = " + q2);
        System.out.println();

        Queue<Integer> q3 = new LinkedList<>();
        System.out.println(isPalindrome(q3));
    }

    public static boolean isPalindrome(Queue<Integer> q) {
        if (q.size() == 0) {
            return true;
        } else {
            if (q.size() % 2 == 0) {
            
            Stack<Integer> s = new Stack<>();
            for (int i = 0; )
                
            }
        }
    }
}
