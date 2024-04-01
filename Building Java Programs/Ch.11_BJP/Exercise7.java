// Exercise 7:
// Write a method countCommon that accepts two lists of integers as parameters and returns the number of
// unique integers that occur in both lists. Use one or more sets as storage to help you solve this problem.

import java.util.*;

public class Exercise7 {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>(List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15));
        List<Integer> list2 = new LinkedList<>(List.of(-5, 15, 2, -1, 7, 15, 36));

        System.out.println("There are " + countCommon(list1, list2) + " common numbers in the lists");
    }

    public static int countCommon(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set = new HashSet<>();
        set.addAll(list1);
        set.retainAll(list2);
        return set.size();
    }
}
