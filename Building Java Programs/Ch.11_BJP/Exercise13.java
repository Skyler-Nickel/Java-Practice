// Exercise 13:
// Write a method isUnique that accepts a map whose keys and values are strings as a parameter and returns
// true if no two keys map to the same value (and false if any two or more keys do map to the same value).

import java.util.*;

public class Exercise13 {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("Marty", "Stepp");
        map.put("Stuart", "Reges");
        map.put("Jessica", "Miller");
        map.put("Amanda", "Camp");
        map.put("Hal", "Perkins");

        Map<String, String> map2 = new TreeMap<>(Map.of("Kendrick", "Perkins", "Stuart", "Reges", "Jessica", 
        "Miller", "Bruce", "Reges", "Hal", "Perkins"));
        
        System.out.println(isUnique(map));
        System.out.println(isUnique(map2));
    }

    public static boolean isUnique(Map<String, String> map) {
        if (map.isEmpty()) {
            return true;
        }
        Set<String> set = new HashSet<>();
        for (String s: map.values()) {
            set.add(s);
        }
        return set.size() == map.size();
    }
}
