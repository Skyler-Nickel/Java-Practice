public class Exercise11 {
    
    public static final int SIZE = 7;

    public static void main(String[] args) {
        for (int i = 1; i <= SIZE; i++) {
            for (int j = SIZE; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();

        for (int i = 1; i <= SIZE; i++) {
            for (int j = 1; j <= SIZE; j++) {
                System.out.print(j);
            }
            System.out.print(0);
        }
        System.out.println();
    }
}
