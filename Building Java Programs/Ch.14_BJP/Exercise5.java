// Exercise 5:
// Write a method called equals that accepts two stacks of integers as parameters and returns true if
// the two stacks store exactly the same sequence of integer values in the same order. Your method must
// restore the two stacks to their original state before returning.

import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6};
        int[] data2 = {1, 7, 10, 13, 11, 9};
        Stack<Integer> s = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();

        for (int i: data) {
            s.push(i);
            s2.push(i);
        }

        for (int i: data2) {
            s3.push(i);
        }

        System.out.println("The stack1 before equals is called = " + s);
        System.out.println("The stack2 before equals is called = " + s2);
        System.out.println();
        
        System.out.println(equals(s, s2));  // Two identical stacks should return true
        
        System.out.println();
        System.out.println("The stack1 after equals is called = " + s);
        System.out.println("The stack2 after equals is called = " + s2);
        System.out.println();
        
        System.out.println(equals(s, s3));  // Two non identical stacks should return false
    }

    public static boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
        Stack<Integer> help = new Stack<>();
        if (s1.size() != s2.size()) {
            return false;
        } else {
            // check if values are equal
            while (!s1.isEmpty()) {
                if (s1.peek() != s2.peek()) {
                    return false;
                }
                help.push(s1.pop());
                help.push(s2.pop());
            }
            
            // add values back to original stacks
            while (!help.isEmpty()) {
                s2.add(help.pop());
                s1.add(help.pop());
            }
        }
        return true;
    }
}
