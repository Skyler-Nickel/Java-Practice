// Exercise 11:
// Write a recursive method called repeat that accepts a string s and an integer n as parameters and that
// returns s concatenated together n times.

public class Exercise11 {
    public static void main(String[] args) {
        System.out.println(repeat("hello", 3));
        System.out.println(repeat("ok", 1));
        System.out.println(repeat("bye", 0));
    }

    public static String repeat(String s, int n) {
        if (n == 0) {
            return "";
        } else {
            return s + repeat(s, n-1);
        }
    }
}
