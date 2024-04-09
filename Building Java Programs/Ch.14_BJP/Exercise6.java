// Exercise 6:
// Write a method called rearrange that accepts a queue of integers as a parameter and rearranges the order
// of the values so that all of the even values appear before the odd values and that otherwise preserves
// the original order of the queue.

import java.util.*;

public class Exercise6 {
    public static void main(String[] args) {
        int[] data = {3, 5, 4, 17, 6, 83, 1, 84, 16, 37};
        Queue<Integer> q = new LinkedList<>();

        for (int i: data) {
            q.add(i);
        }

        System.out.println("The queue before rearrange is called = " + q);
        rearrange(q);
        System.out.println("The queue after rearrange is called = " + q);
    }

    public static void rearrange(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        int oddAmount = 0;

        // find amount of odd integers
        for (int i = 0; i < q.size(); i++) {
            if (q.peek() % 2 != 0) {
                oddAmount++;
            }
            q.add(q.remove());
        }

        // loop and remove odd integers to stack
        int count = 0;
        while (count < oddAmount) {
            if (q.peek() % 2 == 0) {
                q.add(q.remove());
            } else {
                s.push(q.remove());
                count++;
            }
        }

        int size = s.size();
        
        // add odd integers back to queue
        while (!s.isEmpty()) {
            q.add(s.pop());
            // rotate queue to preserver order of odd integers keeping even clustered
            for (int i = 0; i < q.size()-1; i++) {
                q.add(q.remove());
            }
        }

        // rotate even back to front of queue
        for (int i = 0; i < size; i++) {
            q.add(q.remove());
        }
    }
}
