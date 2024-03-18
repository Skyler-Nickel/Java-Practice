// Write a method called printAcronym that accepts a string as its parameter and prints
// the first letter of each word of the string as an acronym.
public class Exercise22 {
    public static void printAcronym(String s) {
        String acronym = "";
        if (s.charAt(0) != '\0') {
            acronym += s.charAt(0);
        }
        for (int i = 1; i < s.length()-1; i++) {
            if ((s.charAt(i) == ' ') && (s.charAt(i+1) != ' ')) {
                acronym += s.charAt(i+1);
            }
        }
        System.out.println(acronym);
    }

    public static void main(String[] args) {
        printAcronym("Breath of the Wild");
    }
}
