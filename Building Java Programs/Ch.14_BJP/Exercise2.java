// Exercise 2:
// Write a method called stutter that accepts a stack of integers as a parameter and replaces every value
// in the stack with two occurrences of that value. 

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        int[] data = {3, 7, 1, 14, 9};
        Stack<Integer> s = new Stack<>();

        for (int i: data) {
            s.push(i);
        }

        System.out.println("Stack before stutter = " + s);
        stutter(s);
        System.out.println("Stack after stutter = " + s);
    }

    public static void stutter(Stack<Integer> s) {
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
            s.push(q.remove());
        }
    }
}
