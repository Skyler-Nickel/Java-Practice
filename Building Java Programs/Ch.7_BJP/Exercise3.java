// Write a method called countInRange that accepts an array of integers, a minimum value
// and a maximum value as parameters and returns the count of how many elements from the
// array fall between the minimum and maximum(inclusive).
public class Exercise3 {
    public static int countInRange(int[] arr, int min, int max) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 4) && (arr[i] <= 17)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {14, 1, 22, 17, 36, 7, -43, 5};
        int inRange = countInRange(arr, 4, 17);
        System.out.println("There are " + inRange + " elements in that range.");
    }
}
