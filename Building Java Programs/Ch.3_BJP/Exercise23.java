public class Exercise23 {
    public static void printIndexed(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c);
            System.out.print((s.length()-1) - i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printIndexed("ZELDA");
    }
}
