// Exercise 21:

public class Exercise21 {
    public static boolean isMagicSquare(int[][] arr) {
        if (arr.length == 0) {
            return false;
        }
        // calculate the first row sum
        int sum = 0;
        for (int column = 0; column < arr[0].length; column++) {
            sum += arr[0][column];
        }

        // check the row length, the sum of every row to the first
        for (int row = 1; row < arr.length; row++) {
            // if current row length != first row length return false
            if (arr[row].length != arr.length) {
                return false;
            }
            // compare the sum of every row to the first row's sum
            int currentRow = 0;
            for (int column = 0; column < arr[row].length; column++) {
                currentRow += arr[row][column];
                // check if current row equals sum
                if (sum != currentRow) {
                    return false;
                }
            }
        }

        // checking for columns
        for (int column = 0; column < arr.length; column++) {
            int currentColumn = 0;
            for (int row = 0; row < arr.length; row++) {
                currentColumn += arr[row][column];
                if (currentColumn != sum) {
                    return false;
                }
            }
        }

        // check diagonally
        int diagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            diagonal += arr[i][i];
        }

        return diagonal == sum;
    }
}