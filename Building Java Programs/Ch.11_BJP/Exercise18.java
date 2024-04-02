// Exercise 18:
// Write a method called reverse that accepts a map from strings to strings as a parameter and returns
// a new map that is reverse of the original. The reverse of a map that uses the values from the original
// as its keys and keys from the original as its values. Since a map's values need not be unique but its 
// keys must be, you should have each value map to a set of keys.


// Will finish chapter tomorrow struggling to focus...

import java.util.*;

public class Exercise18 {
    public static void main(String[] args) {
        Map<String, String> map1 = new TreeMap<>(Map.of("42", "Marty", "81", "Sue", "17", "Ed", "31", "Dave",
        "56", "Ed", "3", "Marty", "29", "Ed"));

        Map<String, String> map2 = reverse(map1);

        System.out.println(map2);
    }

    public static Map<String, String> reverse(Map<String, String> map) {
        Map<String, String> map2 = new TreeMap<>();
        for (String s: map.keySet()) {
            String s2 = map.get(s);
            map2.put(s2, s);
        }
        return map2;
    }
}
