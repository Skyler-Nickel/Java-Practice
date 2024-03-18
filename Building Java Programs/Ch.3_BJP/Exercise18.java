// Write a method called vertical that accepts a string as its parameter and prints
// each letter of the string on sperate lines.
public class Exercise18 {
    public static void vertical(String s) {
        String newS = s;
        newS = newS.replaceAll(" ", "");
        for (int i = 0; i < newS.length(); i++) {
            System.out.println(newS.charAt(i));
        }
    }

    public static void main(String[] args) {
        vertical("hey now");
    }
}
