// This program writes a method called printPowersOfN that accepts
// a base and an exponent as arguments and prints each power of
// the base^0 up to the maximum power

public class Exercise3 {
    public static void printPowersOfN(int base, int power) {
        // using the math class
        for (int i = 0; i <= power; i++) {
            System.out.print((int) Math.pow(base, i) + " ");
        }
        System.out.println();

        // without using the math class 
        for (int i = 0; i <= power; i++) {
            int result = 1;
            for (int j = 0; j < i; j++) {
                result *= base;
            }
            System.out.print(result + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        printPowersOfN(4, 3);
        printPowersOfN(5, 6);
        printPowersOfN(-2, 8);
    }
}
