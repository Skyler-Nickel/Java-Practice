// Textbook examples of some basic sorting algorithms

import java.util.Arrays;

public class SortingExamples {
    public static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    // places elements of the given array into sorted order
    // using the selection sort algorithm.
    // post: array is in sorted (nondecreasing) order
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            // find index of the smallest element
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[smallest]) {
                    smallest = j;
                }
            }
            swap(a, i, smallest);
        }
    }

    // Merge sort
    // Merges the given left and right arrays into given
    // result array. Second, working version.
    // pre: result is empty; left/right are sorted
    // post: result contains result of merging sorted lists.
    public static void merge(int[] result, int[] left, int[] right) {
        int i1 = 0;     // index into left array
        int i2 = 0;     // index into right array
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];       // take from left
            } else {
                result[i] = right[i2];      // take from right
                i2++;
            }
        }
    }

    // Recursive merge sort
    public static void mergeSort(int[] a) {
        int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
        int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
        mergeSort(left);
        mergeSort(right);
        merge(a, left, right);
    }
}
