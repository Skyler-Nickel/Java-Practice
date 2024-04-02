// Exercise 17:
// Write a method called subMap that accepts two maps from strings to strings as parameters and returns true
// if every key in the first map is also contained in the second map and maps to the same value in the second
// map.

import java.util.*;

public class Exercise17 {
    public static void main(String[] args) {
        Map<String, String> map1 = new TreeMap<>(Map.of("Smith", "949-0504", "Marty", "206-9024"));
        Map<String, String> map2 = new TreeMap<>(Map.of("Marty", "206-9024", "Hawking", "123-4567",
        "Smith", "949-0504", "Newton", "123-4567"));
        Map<String, String> map3 = new TreeMap<>(Map.of("John", "123-4567"));

        System.out.println(subMap(map1, map2));
        System.out.println(subMap(map1, map3));
    }

    public static boolean subMap(Map<String, String> map1, Map<String, String> map2) {
        for (String s: map1.keySet()) {
            if (!map2.containsKey(s) || !map1.get(s).equals(map2.get(s))) {
                return false;
            }
        }
        return true;
    }
}
