// Exercise 1:
// Write a method called splitStack that accepts a stack of integers as a parameter and rearranges its
// elements so that all the negatives appear on the bottom of the stack and all the non negatives appear
// on the top.

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        int[] data = {3, -5, 1, 2, -4};
        Stack<Integer> s = new Stack<>();
        
        for (int i: data) {
            s.push(i);
        }

        System.out.println("Stack before splitStack = " + s);
        splitStack(s);
        System.out.println("Stack after splitStack = " + s);
    }

    public static void splitStack(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<>();
        int negCount = 0;
        while (!s.isEmpty()) {
            if (s.peek() < 0) {
                negCount++;
            }
            q.add(s.pop());
        }
        int count = 0;
        
        while (count < negCount) {
            if (q.peek() < 0) {
                s.push(q.remove());
                count++;
            } else {
                q.add(q.remove());
            }
        }

        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        
    }
}
