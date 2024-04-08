// Exercise 20/21:
// Implement an algorithm to shuffle an array of numbers or objects. Implement a "bogus" sorting algorithm
// called bogo sort that uses your shuffling algorithm from the previous exercise to sort an array of numbers.

import java.util.Random;

public class Exercise20 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 4, 5, 6, 10, 12};
        printArr(arr);        
        shuffle(arr);
        printArr(arr);
        bogus(arr);
        printArr(arr);
    }

    public static void bogus(int[] a) {
        while (!isSorted(a)) {
            shuffle(a);
        }
    }

    public static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                return false;
            }
        }
        return true;
    }

    public static void shuffle(int[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length-1; i++) {
            int victim = rand.nextInt(a.length - 1) + 1;
            swap(a, i, victim);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void printArr(int[] a) {
        for (int i: a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
