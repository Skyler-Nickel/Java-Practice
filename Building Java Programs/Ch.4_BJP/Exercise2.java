// Write a method called repl that accepts a string and a number of repetitions as
// parameters and returns the string concatenated that many times 
public class Exercise2 {
    public static String repl(String s, int n) {
        String newS = "";
        if (n < 1) {
            return newS;
        }
        for (int i = 0; i < n; i++) {
            newS += s;
        }
        return newS;
    }

    public static void main(String[] args) {
        System.out.println(repl("hello", 3));
        System.out.println(repl("hello", 0));
    }
}
