public class TwoRectangles {
    
    public static final int HEIGHT = 4;
    public static final int WIDTH = 7;

    public static void main(String[] args) {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < WIDTH; j++) {
                System.out.print( "*");
            }
            System.out.println();
        }
    }
}
