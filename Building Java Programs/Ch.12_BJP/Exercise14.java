// Exercise 14:
// Write a recursive method called dedup that takes a string as a parameter and that returns a new string
// obtained by replacing every sequence of repeated adjacent letters with just one of that letter.

public class Exercise14 {
    public static void main(String[] args) {
        System.out.println(dedup("bookkkkeeper"));
    }

    public static String dedup(String s) {
        if (s.length() < 2) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return dedup(s.substring(1));
        } else {
            return s.charAt(0) + dedup(s.substring(1));
        }
    }
}
