// Exercise 15:
// Write a recursive method vowelsToEnd that takes a string as a parameter and returns a string in which all
// of the vowels hvae been moved to the end.

public class Exercise15 {
    public static void main(String[] args) {
        System.out.println(vowelsToEnd("beautifully"));
    }

    public static String vowelsToEnd(String s) {
        if (s.length() == 0) {
            return s;
        } else if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' 
                        || s.charAt(0) == 'o' || s.charAt(0) == 'u') {
            return vowelsToEnd(s.substring(1)) + s.charAt(0);
        } else {
            return s.charAt(0) + vowelsToEnd(s.substring(1));
        }
    }
}
