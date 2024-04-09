// Exercise 4:
// Write a method called collapse that accepts a stack of integers as a parameter and that collapses it by
// replacing each successive pair of integers with the sum of the pair.

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        int[] data = {7, 2, 8, 9, 4, 11, 7, 1, 42};
        Stack<Integer> s = new Stack<>();

        for (int i: data) {
            s.push(i);
        }

        System.out.println("Stack before collapse = " + s);
        collapse(s);
        System.out.println("Stack after collapse = " + s);
    }

    public static void collapse(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<>();
        int size = s.size() - 1;

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        int collapsed = 0;
        while (!q.isEmpty()) {
            if (!q.isEmpty()) {
                for (int i = 0; i < size; i++) {
                    q.add(q.remove());
                }
                size--;
            }
            collapsed = q.remove();
            if (!q.isEmpty()) {
                for (int i = 0; i < size; i++) {
                    q.add(q.remove());
                }
                size--;
                collapsed += q.remove();
            }
            s.push(collapsed);
        }
    }
}
