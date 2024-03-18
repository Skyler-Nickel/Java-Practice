// Write a method called wordCount that accepts a string as its parameter and returns
// the number of words in the string.
public class Exercise18 {
    public static int wordCount(String s) {
        int count = 0;
        if (s.charAt(0) != ' ') {
            count++;
        }
        for (int i = 0; i < s.length()-1; i++) {
            if ((s.charAt(i) == ' ') && (s.charAt(i+1) != ' ')) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(wordCount("hello"));
        System.out.println(wordCount("how are you?"));
        System.out.println(wordCount("  this  string  has  wide  spaces  "));
        System.out.println(wordCount(" "));
    }
}
