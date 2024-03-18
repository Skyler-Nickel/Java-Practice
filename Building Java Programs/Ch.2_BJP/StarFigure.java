public class StarFigure {
    public static void main(String[] args) {
        int slash = 16;
        int star = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < slash; j++) {
                System.out.print("/");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < slash; j++) {
                System.out.print("\\");
            }
            System.out.println();
            slash-=4;
            star+=8;
        }
    }
}
