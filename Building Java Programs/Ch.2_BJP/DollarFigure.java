public class DollarFigure {
    public static void main(String[] args) {
        int dollar = 7;
        int star = 14;
        for (int i = 0; i < 7; i++) {
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
