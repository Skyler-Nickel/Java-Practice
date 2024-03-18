// Write nested for loops to print right triangle with the current number
// and amount of that number on the line
public class Exercise6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }
}
