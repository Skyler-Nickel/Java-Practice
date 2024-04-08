// Exercise 19:
// Write a modified "dual" version of the selection sort algorithm that selects both the larest and
// smallest elements each pass and moves each of them to the appropriate end of the array.

public class Exercise19 {
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
        for (int i = 0; i < a.length / 2; i++) {
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[smallest]) {
                    smallest = j;
                }
            }
            swap(a, i, smallest);
            printArr(a);

            int largest = i;
            for (int j = i + 1; j < a.length - i; j++) {
                if (a[j] > a[largest]) {
                    largest = j;
                }
            }
            swap(a, a.length - i - 1, largest);
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
