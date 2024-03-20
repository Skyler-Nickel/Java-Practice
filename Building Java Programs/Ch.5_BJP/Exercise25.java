// Write a method called charsSorted that accepts a string as its parameter and returns true if the characters in
// the string appear in sorted alphabetical order. 
public class Exercise25 {
    public static boolean charsSorted(String s) {
        char c;
        char d;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (i+1 < s.length()) {
                d = s.charAt(i+1);
                if (c > d) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(charsSorted("abcde"));
        System.out.println(charsSorted("bins"));
        System.out.println(charsSorted("beads"));
    }
}
