// Write a method called longestSortedSequence that accepts an array of integers as a
// parameter and returns the length of the longest sorted (nondecreasing) sequence
// in the array.
public class Exercise13 {
    public static int longestSortedSequence(int[] a) {
        if (a.length < 1) {
            return 0;
        }
        int count = 1;
        int longest = 0;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] < a[i+1]) {
                count++;
                if (count > longest) {
                    longest = count;
                }
            } else if (a[i] > a[i+1]) {
                count = 1;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};
        int[] arr2 = {};
        System.out.println(longestSortedSequence(arr2));
        System.out.println(longestSortedSequence(arr));
    }
}
