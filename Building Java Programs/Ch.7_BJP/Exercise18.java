// Write a method called evenBeforeOdd that accepts an array of integers and rearranges
// its elements so that all even values appear before all odd.
public class Exercise18 {
    public static void evenBeforeOdd(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }

            while (arr[right] % 2 != 0 && left < right) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--; 
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 4, 2, 11, 9, 10, 4, 7, 3};
        printArr(arr1);
        evenBeforeOdd(arr1);
        printArr(arr1);
    }
}
