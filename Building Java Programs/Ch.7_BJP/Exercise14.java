// Write a method called contains that accepts two arrays of integers a1 and a2 as
// parameters and returns a boolean value indicating whether or not the sequence of
// elements in a2 appears in a1 (true for yes and false for no). The sequence
// must appear consecutively and in the same order.

public class Exercise14 {
    public static boolean contains(int[] a1, int[] a2) {
        int count = 0;
        if (a2.length < 1) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    count++;
                    i++;
                }
            }
            if (count == a2.length) {
                return true;
            }
            count = 0;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
        int[] list2 = {1, 2, 1};
        int[] list3 = {};
        int[] list4 = {10, 15, 4, 1, 2, 1};
        int[] list5 = {1, 2, 1, 8};
        System.out.println(contains(list1, list2));
        System.out.println(contains(list1, list3));
        System.out.println(contains(list1, list4));
        System.out.println(contains(list1, list5));

    }
}
