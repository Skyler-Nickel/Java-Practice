public class DollarFigure2 {

    public static final int SIZE = 10;

    public static void main(String[] args) {
        int dollar = SIZE;
        int star = SIZE*2;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < (i*2) ; j++) {
                System.out.print("*");
            }
            for (int j = dollar; j > 0; j--) {
                System.out.print("$");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            for (int j = dollar; j > 0; j--) {
                System.out.print("$");
            }
            for (int j = 0; j < (i*2); j++) {
                System.out.print("*");
            }
            System.out.println();
            dollar--;
            star-=2;
        }
    }
}
