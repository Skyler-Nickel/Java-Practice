// Write a method called xo that accepts an integer size as a parameter and prints
// a square of size by size characters
public class Exercise7 {
    public static void xo(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || j == size - 1 - i) {
                    System.out.print("x");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        xo(5);
        System.out.println();
        xo(6);
    }
}
