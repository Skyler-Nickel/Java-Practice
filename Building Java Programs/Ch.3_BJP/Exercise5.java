// Write a method called printGrid that accepts two integers representing a number
// of rows and columns and prints a grid

public class Exercise5 {
    public static void printGrid(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            int help = i;
            for (int j = 0; j < columns; j++) {
                System.out.print(help + " ");
                help += rows;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        printGrid(4, 6);
    }
}
