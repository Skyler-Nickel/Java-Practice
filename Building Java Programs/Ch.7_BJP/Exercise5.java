// Write a method called mode that returns the most frequently occurring element of an
// array of integers. Assume the array has at least one element and that every element
// in the array has a value between 0 and 100 inclusive. Break ties by choosing the 
// lower value.


public class Exercise5 {
    public static int mode(int[] arr) {
        int[] arr2 = new int[101];
        int occurences = 0;
        int mode = 0;
        for (int i: arr) {
            arr2[i]++;
            if (occurences < arr2[i]) {
                occurences = arr2[i];
                mode = i;
            }
        }
        return mode;
    }

    public static void main(String[] args) {
        int[] arr = {27, 15, 15, 11, 27};
        int frequent = mode(arr);
        System.out.println("The mode is " + frequent);
    }
}
