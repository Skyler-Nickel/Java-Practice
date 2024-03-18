// Write a method called numUnique that takes three integers as parameters and returns
// the number of unique integers amoung the three
public class Exercise20 {
    public static int numUnique(int a, int b, int c) {
        if ((a == b) && (b == c)) {
            return 1;
        } else if ((a == b) || (b == c) || (a == c)) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(numUnique(2, 2, 2));
        System.out.println(numUnique(6, 7, 6));
        System.out.println(numUnique(18, 3, 4));
    }
}
