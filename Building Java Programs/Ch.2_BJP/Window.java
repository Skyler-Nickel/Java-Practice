public class Window {
    
    public static final int SIZE = 3;

    public static void drawLine() {
        for (int i = 1; i < SIZE; i++) {
            System.out.print("+");
            for (int j = 1; j <= SIZE; j++) {
                System.out.print("=");
            }
        }
        System.out.print("+");
        System.out.println();
    }

    public static void middle() {
        for (int i = 1; i < SIZE; i++) {
            System.out.print("|");
            for (int j = 1; j <= SIZE; j++) {
                System.out.print(" ");
            }
        }
        System.out.print("|");
        System.out.println();
    }

    public static void main(String[] args) {
        drawLine();
        middle();
        middle();
        middle();
        drawLine();
        middle();
        middle();
        middle();
        drawLine();
    }
}
