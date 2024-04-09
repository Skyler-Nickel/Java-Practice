// A textbook example provided in chapter 14
// A program that demonstrates basic queue operations.

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        String[] data = {"to", "be", "or", "not", "to", "be"};
        Queue<String> q = new LinkedList<>();

        for (String str: data) {
            q.add(str);
        }

        System.out.println("queue = " + q);
        System.out.println("size = " + q.size());
        System.out.println("peek = " + q.peek());
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }

    public static Queue<Integer> makeRandomQueue(int size) {
        Queue<Integer> q = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            q.add(r.nextInt(100));
        }
        return q;
    }

    public static void queueToStack(Queue<Integer> q, Stack<Integer> s) {
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }

    public static int sum(Queue<Integer> q) {
        int sum = 0;
        for (int i = 0; i < q.size(); i++) {
            int n = q.remove();
            sum += n;
            q.add(n);
        }
        return sum;
    }

    public static void removeAll(Queue<Integer> q, int value) {
        int oldSize = q.size();
        for (int i = 0; i < oldSize; i++) {
            int n = q.remove();
            if (n != value) {
                q.add(n);
            }
        }
    }
}
