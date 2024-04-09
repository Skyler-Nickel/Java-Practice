// Example program provided in the Textbook chapter 14:
// A program that demonstrates basic stack operations.

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        String[] data = {"to", "be", "or", "not", "to", "be"};
        Stack<String> s = new Stack<>();

        for (String str: data) {
            s.push(str);
        }

        System.out.println("stack = " + s);
        System.out.println("size = " + s.size());
        System.out.println("peek = " + s.peek());
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
        System.out.println();
    }

    // makes a stack out of random integers using random class
    public static Stack<Integer> makeRandomStack(int size) {
        Random r = new Random();
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < size; i++) {
            s.push(r.nextInt(100));
        }
        return s;
    }

    // converts a stack to a queue
    public static void stackToQueue(Stack<Integer> s, Queue<Integer> q) {
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    // returns the sum of a stack and restores initial stack state
    public static int sum(Stack<Integer> s) {
        int sum = 0;
        Queue<Integer> q = new LinkedList<>();
        while (!s.isEmpty()) {
            int n = s.pop();
            sum += n;
            q.add(n);
        }
        queueToStack(q, s);
        stackToQueue(s, q);
        queueToStack(q, s);
        return sum;
    }

    // converts a queue to a stack
    public static void queueToStack(Queue<Integer> q, Stack<Integer> s) {
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }

    // compares two stacks of integers for same parity(odd vs even).
    // Test whether two stacks have even and odd numbers in the same position.
    public static boolean sameParityPattern(Stack<Integer> s1, Stack<Integer> s2) {
        if (s1.size() != s2.size()) {
            return false;
        } else {
            Stack<Integer> s3 = new Stack<>();
            boolean same = true;
            while (same && !s1.isEmpty()) {
                int num1 = s1.pop();
                int num2 = s2.pop();
                if (num1 % 2 != num2 % 2) {
                    same = false;
                }
                s3.push(num1);
                s3.push(num2);
            }
            while (!s3.isEmpty()) {
                s2.push(s3.pop());
                s1.push(s3.pop());
            }
            return same;
        }
    }
}