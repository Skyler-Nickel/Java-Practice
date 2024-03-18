// This program writes a method called printNumbers that accepts
// a maximum number as an argument and prints from 1 to that number
// boxed by square brackets
public class Exercise1 {
    public static void printNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("[" + i + "]" + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printNumbers(15);
        printNumbers(5);
    }
}