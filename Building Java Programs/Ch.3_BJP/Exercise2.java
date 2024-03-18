// This program writes a method called printPowersOf2 that accepts
// a maximum number as an argument and prints each power of 2 from
// 2^0 up to maximum power

public class Exercise2 {
    public static void printPowersOf2(int number) {
        // using math class
        for (int i = 0; i <= number; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
        System.out.println();

        // without math class
        for (int i = 0; i <= number; i++) {
            int power = 1;
            for (int j = 0; j < i; j++) {
                power *= 2;
            }
            System.out.print(power + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        printPowersOf2(3);
        printPowersOf2(10);
    }
}
