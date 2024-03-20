// Write a method called isAllVowels that returns whether a string consist entirely of vowels (a, e, i, o, u).
public class Exercise24 {
    public static boolean isAllVowels(String s) {
        String s1 = s.toUpperCase();
        char c;
        for (int i = 0; i < s1.length(); i++) {
            c = s1.charAt(i);
            if (!((c == 65) || (c == 69) || (c == 73) || (c == 79) || (c == 85))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAllVowels(""));
        System.out.println(isAllVowels("eIEio"));
        System.out.println(isAllVowels("oink"));
    }
}
