// Exercise 10:
// Write a method removeEvenLength that accepts a set of strings as a parameter and that removes all
// of the strings of even length from the set.

import java.util.*;

public class Exercise10 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(List.of("The", "world", "is", "truely", "unique"));

        System.out.println("Set before removeEvenLength is called = " + set);
        removeEvenLength(set);
        System.out.println("Set after removeEvenLength is called = " + set);
    }

    public static void removeEvenLength(Set<String> set) {
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            String s = itr.next();
            if (s.length() % 2 == 0) {
                itr.remove();
            }
        }
    }
}
