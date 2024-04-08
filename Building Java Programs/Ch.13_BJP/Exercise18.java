// Exercise 18:
// Write a modified version of the selection sort algorithm that selects the largest element each time
// and moves it to the end of the array, rather than selecting the smallest element and moving it to the
// beginning.


public class Exercise18 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 95;
        arr[1] = 74;
        arr[2] = 10;
        arr[3] = 20;
        arr[4] = 30;
        arr[5] = 40;
        System.out.print("Before sort = ");
        printArr(arr);
        selectionSortM(arr);
        System.out.print("After sort = ");
        printArr(arr);
    }

    public static void selectionSortM(int[] a) {
        for (int i = a.length-1; i >= 1; i--) {
            int largest = i;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[largest]) {
                    largest = j;
                }
            }
            swap(a, largest, i);
            printArr(a);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void printArr(int[] a) {
        for (int i: a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
