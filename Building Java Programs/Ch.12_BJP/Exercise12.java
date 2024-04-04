// Exercise 12:
// Write a recursive method called isReverse that accepts two strings as parameters and returns true if
// the two strings contain the same sequence of characters as each other but in the opposite order
// (ignoring capitalization), and false otherwise.

public class Exercise12 {
    public static void main(String[] args) {
        System.out.println(isReverse("hello", "oLLeH"));
        System.out.println(isReverse("hello", "olleh"));
        System.out.println(isReverse("bye", "hello"));
    }

    public static boolean isReverse(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        if (s1.length() == 0) {
            return true;
        }

        char c1 = Character.toLowerCase(s1.charAt(0));
        char c2 = Character.toLowerCase(s2.charAt(s2.length()-1));

        return (c1 == c2) && isReverse(s1.substring(1), s2.substring(0, s2.length()-1));
    }
}
