// Write nested for loops to produce 4(col) X 5(row) stars
public class Exercise4 {
    public static final int COLUMN = 4;
    public static final int ROW = 5;
    public static void main(String[] args) {
        for (int i = 1; i <= COLUMN; i++) {
            for (int j = 1; j <= ROW; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
