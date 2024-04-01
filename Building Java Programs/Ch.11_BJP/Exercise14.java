// Exercise 14:
// Write a method intersect that accepts two maps whose keys are strings and whose values are integers
// as parameters and returns a new map containing only the key/value pairs that exist in both of the
// parameter maps. In order for a key/value pair to be included in your result, not only do both maps
// need to contain a mappping for that key, but they need to map it to the same value.

// using treemap is less efficient but hashmap is giving error that I don't want to debug atm.... too tired

import java.util.*;

public class Exercise14 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new TreeMap<>(Map.of("Janet", 87, "Logan", 62, "Whitaker", 46,
        "Alyssa", 100, "Stefanie", 80, "Jeff", 88, "Kim", 52, "Sylvia", 95));
        Map<String, Integer> map2 = new TreeMap<>(Map.of("Logan", 62, "Kim", 52, "Whitaker", 52, "Jeff", 88,
        "Stefanie", 80, "Brian", 60, "Lisa", 83, "Sylvia", 87));
        Map<String, Integer> map3 = intersect(map1, map2);
        System.out.println("The new map is " + map3);
    }

    public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> map3 = new TreeMap<>();
        Set<String> set = new HashSet<>();
        set.addAll(map1.keySet());
        set.retainAll(map2.keySet());
        for (String s: set) {
            if (map1.get(s) == map2.get(s)) {
                map3.put(s, map1.get(s));
            }
        }
        return map3;
    }
}
