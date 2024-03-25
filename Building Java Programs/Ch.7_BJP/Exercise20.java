// Write a method called matrixAdd that accepts a pair of two-dimensional arrays
// of integers as parameters, treats the arrays as two-dimensional matrixes, and returns
// their sum.
public class Exercise20 {
    public static int[][] matrixAdd(int[][] a1, int[][]a2) {
        int[][] arr = new int[a1.length][a1[0].length];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                arr[i][j] = a1[i][j] + a2[i][j];
            }
        }
        return arr;
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] arr2 = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] result = matrixAdd(arr, arr2);
        printArr(result);
    }
}
