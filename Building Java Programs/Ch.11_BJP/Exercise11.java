// Exercise 11:
// Write a method called symmetricSetDifference that accepts two Sets as parameters and returns a new Set
// containing their symmetric set difference(that is, the set of elements contained in either of the two
// sets but not in both).

import java.util.*;

public class Exercise11 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(List.of(1, 4, 7, 9));
        Set<Integer> set2 = new HashSet<>(List.of(2, 4, 5, 6, 7));

        Set<Integer> set3 = symmetricSetDifference(set, set2);
        System.out.println("The new set is " + set3);
    }

    public static Set<Integer> symmetricSetDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new HashSet<>();
        set.addAll(set1);
        set.addAll(set2);
        Set<Integer> set3 = new HashSet<>();
        set3.addAll(set1);
        set3.retainAll(set2);
        set.removeAll(set3);
        
        return set;
    }
}
