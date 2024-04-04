// Write a recursive method called writeChars that accepts an integer parameter n and that prints out a
// total of n characters. The middle character of the output should always be an asterisk("*"). If you
// are asked to write out an even number of characters, then there will be two asterisks in the middle("**").
// Before the asterisk(s) you should write out less-than characters("<"). After the asterisk(s) you should
// write out greater-than characters(">").

public class Exercise7 {
    public static void main(String[] args) {
        writeChars(1);
        System.out.println();
        writeChars(2);
        System.out.println();
        writeChars(3);
        System.out.println();
        writeChars(4);
        System.out.println();
        writeChars(5);
        System.out.println();
        writeChars(6);
        System.out.println();
        writeChars(7);
        System.out.println();
        writeChars(8);
        System.out.println();
    }

    public static void writeChars(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Please enter a valid value greater than 0.");
        }
        if (n == 1) {
            System.out.print("*");
        } else if (n == 2) {
            System.out.print("*");
            writeChars(n-1);
        } else if (n % 2 == 0) {
            System.out.print("<");
            writeChars(n-2);
            System.out.print(">");
        } else {
            System.out.print("<");
            writeChars(n-2);
            System.out.print(">");
        }
    }
}
