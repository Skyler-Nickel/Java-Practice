// Exercise 9:
// Write a method hasOdd that accepts a set of integers as a parameter and returns true if the set contains
// at least one odd integer. If passed the empty set, your method should return false.

import java.util.*;

public class Exercise9 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(List.of(0, 2, 4, 6, 8, 9, 10));
        Set<Integer> set2 = new HashSet<>(List.of(2, 4, 6));
        Set<Integer> set3 = new HashSet<>();

        System.out.println(hasOdd(set));
        System.out.println(hasOdd(set2));
        System.out.println(hasOdd(set3));
    }

    public static boolean hasOdd(Set<Integer> set) {
        if (set.size() == 0) {
            return false;
        }
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            int temp = itr.next();
            if (temp % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}
