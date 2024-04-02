// Exercise 16:
// Write a method called is1to1 that accepts a map whose keys and values are strings as its parameter and
// returns true if no two keys map to the same value.

// Alright im done for the night will finish tomorrow....

import java.util.*;

public class Exercise16 {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>(Map.of("Marty", "206-9024", "Hawking", "123-4567",
        "Smith", "949-0504", "Newton", "123-4567"));
        
        Map<String, String> map2 = new TreeMap<>(Map.of("Marty", "206-9024", "Hawking", "555-1234",
        "Smith", "949-0504", "Newton", "123-4567"));

        System.out.println(is1to1(map));
        System.out.println(is1to1(map2));
    }

    public static boolean is1to1(Map<String, String> map) {
        Set<String> set = new HashSet<>();
        set.addAll(map.values());
        if (set.size() == map.size()) {
            return true;
        }
        return false;
    }
}
