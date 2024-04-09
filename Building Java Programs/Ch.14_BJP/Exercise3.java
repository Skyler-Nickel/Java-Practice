// Exercise 3:
// Write a method called copyStack that accepts a stack of integers as a parameter and returns a copy
// of the original stack(i.e., a new stack with the same values as the original, stored in the same
// order as the original).

import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6};
        Stack<Integer> s = new Stack<>();

        for (int i: data) {
            s.push(i);
        }

        System.out.println("The original stack (before) = " + s);
        Stack<Integer> s2 = copyStack(s);
        System.out.println("The original stack (after) = " + s);
        System.out.println("The copied stack = " + s2);
    }

    public static Stack<Integer> copyStack(Stack<Integer> s) {
        Stack<Integer> s2 = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        int size = s.size() - 1;
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        while (!q.isEmpty()) {
            if (!q.isEmpty()) {
                for (int i = 0; i < size; i++) {
                    q.add(q.remove());
                }
                size--;
            }
            s.push(q.peek());
            s2.push(q.remove());
        }

        return s2;
    }
}
