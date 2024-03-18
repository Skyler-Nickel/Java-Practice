// Write a method called printReverse that accepts a string as its parameter and prints
// the characters in the opposite order
public class Exercise19 {
    public static void printReverse(String s) {
        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printReverse("hello there!");
    }
}
