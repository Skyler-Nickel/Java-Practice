// Write a method called minGap that accepts an integer array as a parameter
// and returns the minimum difference or gap between adjacent values in the array,
// where the gap is defined as the later value minus the earlier value.
public class Exercise9 {
    public static int minGap(int[] a) {
        if (a.length-1 < 2) {
            return 0;
        }
        int[] arr = new int[a.length-1];
        for (int i = 0; i < a.length-1; i++) {
            arr[i] = a[i+1] - a[i];
        }
        sort(arr);
        return arr[0];
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 12};
        int[] arr2 = {1, 2};
        int[] arr3 = {10, 9, 8};
        System.out.println(minGap(arr));
        System.out.println(minGap(arr2));
        System.out.println(minGap(arr3));
    }
}
