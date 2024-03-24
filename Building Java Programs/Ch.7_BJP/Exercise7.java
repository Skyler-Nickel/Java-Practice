// Write a method called kthLargest that accepts an integer k and an array a as its
// parameters and returns the element such that k elements have greater or equal value.
// if k=0, return the largest element; if k-1 return the second largest element, and
// so on.

public class Exercise7 {
    public static int kthLargest(int k, int[] a) {
        sort(a);
        for (int i = 0; i < a.length/2; i++) {
            int j = a.length - i - 1;
            swap(a, i, j);
        }
        return a[k];
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                int temp = 0;
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {74, 85, 102, 99, 101, 56, 84};
        System.out.println(kthLargest(2, arr));
        System.out.println(kthLargest(1, arr));
        System.out.println(kthLargest(0, arr));
    }
}
