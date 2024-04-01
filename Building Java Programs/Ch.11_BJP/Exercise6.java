// Exercise 6:
// Write a method called countUnique that accepts a list of integers as a parameter and returns the number
// of unique integer values in the list. Use a set as auxiliary storage to help you solve this problem.

import java.util.*;

public class Exercise6 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15));
        System.out.println("List contains = " + list);
        System.out.println("Unique numbers in list = " + countUnique(list));
    }

    public static int countUnique(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        return set.size();
    }
}
