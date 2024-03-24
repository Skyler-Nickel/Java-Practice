// Write a method called median that accepts an array of integers as its parameters
// and returns the median of the numbers in the array. The median is the number that
// appears in the middle of the list if you arrange the elements in order. Assume
// the array is of odd size 
public class Exercise8 {
    public static int median(int[] a) {
        sort(a);
        return a[a.length / 2];
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
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
        int[] arr = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
        int[] arr2 = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
        System.out.println("The median is " + median(arr));
        System.out.println("The median is " + median(arr2));
    }
}
