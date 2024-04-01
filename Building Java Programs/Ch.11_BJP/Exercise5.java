// Exercise 5:
// Write a method called sortAndRemoveDuplicates that accepts a list of integers as its parameter and
// rearranges the list's elements into sorted ascending order, as well as removing all duplicate values
// from the list.

import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(List.of(7, 4, -9, 4, 15, 8, 27, 7, 11,
            -5, 32, -9, -9));
        
        System.out.println("List before calling sortAndRemoveDuplicates = " + list);
        sortAndRemoveDuplicates(list);
        System.out.println("List after calling sortAndRemoveDuplicates = " + list);
    }

    public static void sortAndRemoveDuplicates(List<Integer> list) {
        Set<Integer> set = new TreeSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
    }
}
