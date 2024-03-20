
// Write a method called hopscotch that accepts an integer number of "hops"
// as its parameter and prints a pattern of numbers that resembles a hopscotch board.
public class Exercise10 {
    public static void hopscotch(int hops) {
        if (hops < 0) {
            return;
        } else if (hops == 0) {
            System.out.println("  " + 1);
        } else {
            System.out.println("  " + 1);
            for (int i = 1; i <= hops; i++) {
                System.out.println(((i*3) - 1) + "   " + (i*3));
                System.out.println("  " + ((i*3) + 1));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            hopscotch(i);
        }
    }
}
