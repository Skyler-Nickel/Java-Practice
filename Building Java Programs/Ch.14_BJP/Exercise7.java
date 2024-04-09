// Exercise 7:
// Write a method called reverseHalf that accepts a queue of integers as a parameter and reverses
// the order of all elements in odd-numbered positions (position 1, 3, 5, etc.), assuming that the first
// value in the queue has position 0.

import java.util.*;

public class Exercise7 {
    public static void main(String[] args) {
        int[] data = {1, 8, 7, 2, 9, 18, 12, 0};
        Queue<Integer> q = new LinkedList<>();

        int[] data2 = {1, 8, 7, 2, 9, 18, 12, 0, 10};
        Queue<Integer> q2 = new LinkedList<>();

        for (int i: data) {
            q.add(i);
        }

        for (int i: data2) {
            q2.add(i);
        }

        System.out.println("The order of the queue before reverseHalf = " + q);
        reverseHalf(q);
        System.out.println("The order of the queue after reverseHalf = " + q);

        System.out.println("The order of the queue before reverseHalf = " + q2);
        reverseHalf(q2);
        System.out.println("The order of the queue after reverseHalf = " + q2);
    }

    public static void reverseHalf(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        int size = q.size();
        for (int i = 0; i < size; i++) {
            if (i % 2 != 0) {
                s.push(q.remove());
            } else {
                q.add(q.remove());
            }
        }

        while (!s.isEmpty()) {
            q.add(q.remove());
            q.add(s.pop());
        }

        if (size % 2 != 0) {
            q.add(q.remove());
        }
    }
}
