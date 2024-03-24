// Write a method called collapse that accepts an array of integers as a parameter and returns
// a new array containing the result of replacing each pair of integers with the sum
// of that pair.

public class Exercise15 {
    public static int[] collapse(int[] a) {
        int size = 0;
        if (a.length % 2 == 0) {
            size = a.length/2;
        } else {
            size = (a.length/2) + 1;
        }
        int[] newArr = new int[size];
        if (size % 2 == 0) {
            int index = 0;
            for (int i = 0; i < a.length-1; i+=2) {
                newArr[index] = a[i] + a[i+1];
                index++; 
            }
        } else {
            int index = 0;
            for (int i = 0; i < a.length-1; i+=2) {
                newArr[index] = a[i] + a[i+1];
                index++; 
            }
            newArr[size-1] = a[a.length-1];
        }
        return newArr;
    }

    public static void printList(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] list = {7, 2, 8, 9, 4, 13, 7, 1, 9, 10};
        int[] list2 = collapse(list);
        int[] list3 = {1, 2, 3, 4, 5};
        int[] list4 = collapse(list3);
        printList(list2);
        printList(list4);
    }
}
