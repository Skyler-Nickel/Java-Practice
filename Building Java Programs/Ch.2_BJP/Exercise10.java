public class Exercise10 {
    public static void main(String[] args) {
        int spaces = 9;
        for (int i = 1; i <= 6; i++) {
            for (int j = spaces; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();

        for (int i = 1; i <= 6; i ++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j);
            }
            System.out.print(0);
        }
        System.out.println();
    }
}
