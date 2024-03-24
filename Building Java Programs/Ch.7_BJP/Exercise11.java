// Write a method called isUnique that accepts an array of integers as a parameter and
// returns a boolean value indicating whether or not the values in the array are unique
// (true for yes, false for no). The values in the list are considered unique if there
// is no pair of values that are equal.

import java.util.*;

public class Exercise11 {
    public static boolean isUnique(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] == a[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 12, 2, 9, 17, 43, -8, 46};
        int[] arr2 = {4, 7, 3, 9, 12, -47, 3, 74};
        System.out.println(isUnique(arr));
        System.out.println(isUnique(arr2));
    }
}
