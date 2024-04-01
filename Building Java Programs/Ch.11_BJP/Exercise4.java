// Exercise 4:
// Write a method called partition that accepts a list of integers and an integer value E as its parameter,
// and rearranges(partitions) the list so that all the elements with values less than E occur before all
// elements with values greater than E. The exact order of the elements is unimportant, so long as
// all elements less than E appear before all elements greater than E.

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(List.of(15, 1, 6, 12, -3, 4, 8, 21, 2,
        30, -1, 9));
        System.out.println("List before partition is called = " + list);
        partition(list, 5);
        System.out.println("List after partition is called = " + list);
    }

    public static void partition(List<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < value) {
                list.add(0, list.remove(i));
            }
        }
    }
}
