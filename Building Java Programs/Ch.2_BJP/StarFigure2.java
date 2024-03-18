public class StarFigure2 {
    
    public static final int HEIGHT = 6;

    public static void main(String[] args) {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = HEIGHT*4-4; j > i*4; j--) {
                System.out.print("/");
            }
            for (int j = 0; j < i*8; j++) {
                System.out.print("*");
            }
            for (int j = HEIGHT*4-4; j > i*4; j--) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
