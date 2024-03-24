// Write a method called range that returns the range of values in an array of integers.
// The range is defined as 1 more than the difference between the maximum and minimum
// values in the array.
public class Exercise2 {
    public static int range(int[] arr) {
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            } else if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return (maximum - minimum) + 1;
    }

    public static void main(String[] args) {
        int[] arr = {36, 12, 25, 19, 46, 31, 22};
        int range = range(arr);
        System.out.println("The range is " + range);
    }
}
