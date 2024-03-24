// Write a method called append that accepts two integer arrays as parameters
// and returns a new array that contains the result of appending the second array's
// values at the end of the first array.
public class Exercise16 {
    public static int[] append(int[] a1, int[] a2) {
        int size = a1.length + a2.length;
        int[] newArr = new int[size];
        int index = 0;
        
        for (int i = 0; i < a1.length; i++) {
            newArr[index] = a1[i];
            index++;
        }

        for (int i = 0; i < a2.length; i++) {
            newArr[index] = a2[i];
            index++;
        }
        
        return newArr;
    }

    public static void printArr(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] list1 = {2, 4, 6};
        int[] list2 = {1, 2, 3, 4, 5};
        int[] list3 = append(list1, list2);
        int[] list4 = append(list2, list1);
        printArr(list3);
        printArr(list4);
    }
}
