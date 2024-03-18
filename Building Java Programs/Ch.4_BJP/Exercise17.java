// Write a method called stutter that accepts a string parameter and returns that string
// with its characters repeated twice
public class Exercise17 {
    public static String stutter(String s) {
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            s2 += s.charAt(i);
            s2 += s.charAt(i);
        }
        return s2;
    }

    public static void main(String[] args) {
        System.out.println(stutter("Hello!"));
        System.out.println(stutter("Bye!"));
    }
}
