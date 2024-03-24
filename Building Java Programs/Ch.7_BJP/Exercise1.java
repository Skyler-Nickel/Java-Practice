// Write a method called lastIndexOf that accepts an array of integers and an integer
// value as its parameters and returns the last index at which the value occurs in the
// array. The method should return -1 if the value is not found.


public class Exercise1 {
    public static int lastIndexOf(int[] arr, int num) {
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static int[] buildArr() {
        int[] data = {74, 85, 102, 99, 101, 85, 56};
        return data;
    }

    public static void main(String[] args) {
        int[] arr = buildArr();
        int index = lastIndexOf(arr, 85);
        System.out.println("The index of 85 is " + index);
        index = lastIndexOf(arr, 0);
        System.out.println("The index of 0 is " + index + " because it is not in the array.");
    }
}