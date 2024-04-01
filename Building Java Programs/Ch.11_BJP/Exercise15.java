// Exercise 15:
// Write a method maxOccurrences that accepts a list of integers as a parameter and returns the number of
// times the most frequently occurring integer (the "mode") occurs in the list. Solve this problem using a map
// as auxiliary storage. If the list is empty, return 0.

import java.util.*;

public class Exercise15 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>(List.of(1, 2, 3, 3, 3, 3, 3, 4, 5, 6));

        System.out.println("The mode is " + maxOccurrences(list));
        System.out.println("The mode is " + maxOccurrences(list2));
    }

    public static int maxOccurrences(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        
        Map<Integer, Integer> map = new TreeMap<>();
        
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            if (map.containsKey(temp)) {
                int count = map.get(temp);
                map.put(temp, count + 1);
            } else {
                map.put(temp, 1);
            }
        }
        
        return Collections.max(map.values());
    }
}
