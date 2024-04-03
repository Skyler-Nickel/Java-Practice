// Exercise 19:
// Write a method called rarest that accepts a map whose keys are strings and whose values are integers
// as a parameter and returns the integer value that occurs the fewest times in the map. If there is a tie
// return the smaller integer value. If map is empty throw exception

import java.util.*;

public class Exercise19 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 123);
        map.put("Sally", 123);
        map.put("Ed", 123);
        map.put("Freddy", 2);
        map.put("Ron", 2);
        map.put("Steve", 1);

        System.out.println("The value that occurs the fewest times is " + rarest(map));

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("John", 12);
        map2.put("Sally", 12);
        map2.put("Ed", 1);
        map2.put("Freddy", 2);
        map2.put("Ron", 2);
        map2.put("Steve", 1);
        map2.put("Frank", 1);

        System.out.println("The value that occurs the fewest times is " + rarest(map2));

        //Map<String, Integer> map3 = new HashMap<>();

        //System.out.println("The value that occurs the fewest times is " + rarest(map3));
    }

    public static int rarest(Map<String, Integer> map) {
        if (map.size() == 0) {
            throw new IllegalArgumentException("Map is empty");
        }
        
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i: map.values()) {
            if (map2.containsKey(i)) {
                map2.put(i, map2.get(i) + 1);
            } else {
                map2.put(i, 1);
            }
        }
        
        int min = Integer.MAX_VALUE;
        int rarest = 0;

        for (int i: map2.keySet()) {
            if (map2.get(i) < min) {
                min = map2.get(i);
                rarest = i;
            }
        }

        return rarest;
    }
}
