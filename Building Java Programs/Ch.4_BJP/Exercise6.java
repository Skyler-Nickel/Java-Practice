// Write a method called printRange that accepts two integers as arguments and
// prints the sequence of numbers between the two arguments
public class Exercise6 {
    public static void printRange(int low, int high) {
        if (low < high) {
            for (int i = low; i <= high; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = low; i >= high; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printRange(2, 7);
        printRange(19, 11);
        printRange(5, 5);
    }
}
