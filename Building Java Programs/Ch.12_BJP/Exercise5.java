// Write a recursive method called writeBinary that accepts an integer as a parameter and writes its binary
// representation to the console.

public class Exercise5 {
    public static void main(String[] args) {
        writeBinary(44);
        System.out.println();
        writeBinary(0);
        System.out.println();
        writeBinary(4);
        System.out.println();
        writeBinary(128);
        System.out.println();
    }

    public static void writeBinary(int n) {
        if (n == 0) {
            System.out.print(0);
        } else {
            writeBinary(n / 2);
            System.out.print(n % 2);
        }
    }
}
