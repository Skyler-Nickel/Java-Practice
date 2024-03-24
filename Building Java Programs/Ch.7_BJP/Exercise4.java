// Write a method called isSorted that accepts an array of real numbers as a parameter
// and returns true if the list is in sorted(nondecreasing) order and false otherwise.
public class Exercise4 {
    public static boolean isSorted(double[] arr) {
        double temp = 0.0;
        for (int i = 0; i < arr.length; i++) {
            if (temp > arr[i]) {
                return false;
            }
            temp = arr[i];
        }
        return true;
    }

    public static void main(String[] args) {
        double[] arr1 = {16.1, 12.3, 22.2, 14.4};
        double[] arr2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
        System.out.println(isSorted(arr1));
        System.out.println(isSorted(arr2));
    }
}
