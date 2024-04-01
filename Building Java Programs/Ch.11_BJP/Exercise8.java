// Exercise 8:
// Write a method maxLength that accepts a set of strings as a parameter and that returns the length
// of the longest string in the list.

import java.util.*;

public class Exercise8 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(List.of("Life", "can", "be", "a", "wonderful", "thing"));
        Set<String> set2 = new HashSet<>();

        System.out.println("The longest string in the set is " + maxLength(set) + " letters long");
        System.out.println("The longest string in the set is " + maxLength(set2) + " letters long");
    }

    public static int maxLength(Set<String> set) {
        if (set.size() == 0) {
            return 0;
        }
        Iterator<String> itr = set.iterator();
        int max = 0;
        while (itr.hasNext()) {
            String s = itr.next();
            if (max < s.length()) {
                max = s.length();
            }
        }
        return max;
    }
}
