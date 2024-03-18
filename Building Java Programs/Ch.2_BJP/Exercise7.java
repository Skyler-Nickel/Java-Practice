// Use nested for loops to print spaces followed by current line number
public class Exercise7 {
    public static void main(String[] args) {
        int spaces = 4;
        for (int i = 1; i <= 5; i++) {
            for (int j = spaces; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print(i);
            System.out.println();
            spaces--;
        }
        System.out.println();
    }
}
