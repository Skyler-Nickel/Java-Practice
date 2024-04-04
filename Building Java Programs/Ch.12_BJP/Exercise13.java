// Exercise 13:
// Write a recursive method called indexOf that accepts two strings as parameters and that returns the
// starting index of the first occurrence of the second string inside the first string (or -1 if not found).

public class Exercise13 {
    public static void main(String[] args) {
        System.out.println("The index is " + indexOf("Barack Obama", "bam"));
        System.out.println("The index is " + indexOf("Barack Obama", "ck"));
        System.out.println("The index is " + indexOf("Barack Obama", "Bar"));
        System.out.println("The index is " + indexOf("Barack Obama", "a"));
        System.out.println("The index is " + indexOf("Barack Obama", "McCain"));
    }

    public static int indexOf(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return -1;
        } else if (s1.substring(0, s2.length()).equals(s2)) {
            return 0;
        }

        int tally = indexOf(s1.substring(1), s2);

        return tally != -1 ? 1 + tally : -1;
    }
}
