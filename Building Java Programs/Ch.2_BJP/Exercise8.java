public class Exercise8 {
    public static void main(String[] args) {
        int spaces = 4;
        for (int i = 1; i <= 5; i++) {
            for (int j = spaces; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
            spaces--;
        }
    }
}
