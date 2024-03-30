// Write a method called averageVowels that takes an ArrayList of Strings as a parameter
// and returns the average number of vowel characters (a,e,i,o,u) in all Strings in the list.
// If your method is passed an empty ArrayList, it should return 0.0.

import java.util.*;

public class Exercise1 {
    public static double averageVowels(ArrayList<String> list) {
        double vowel = 0.0;
        double total = 0.0;
        if (list.size() == 0) {
            return 0.0;
        }
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            total += s.length();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' ||
                    s.charAt(j) == 'o' || s.charAt(j) == 'u') {
                    vowel++;
                }
            }
        }
        return vowel / total;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("four");           // 4 letters, 2 vowels
        list.add("score");          // 5 letters, 2 vowels
        list.add("and");            // 3 letters, 1 vowel
        list.add("seven");          // 5 letters, 2 vowels
        list.add("years");          // 5 letters, 2 vowels
        list.add("ago");            // 3 letters, 2 vowels
        System.out.println(averageVowels(list));    // 25 letters, 11 vowels, should return (11/25) = 0.44
        ArrayList<String> list2 = new ArrayList<>();    // empty list
        System.out.println(averageVowels(list2));       // should return 0.0
    }
}