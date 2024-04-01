// Exercise 2:
// Write a method called alternate that accepts two Lists as its parameters and returns a new List
// containing alternating elements from the two lists, in the following order:

// - First element from the first list
// - First element from the second list
// - Second element from the first list
// - Second element from the second list
// - Third element from the first list
// - Third element from the second list
// ......

// If the lists do not contain the same number of elements, the remaining elements from the longer list
// should be placed consecutively at the end.

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        List<Integer> list2 = new LinkedList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        list2.add(11);
        list2.add(12);

        List<Integer> list3 = alternate(list1, list2);
        System.out.println("List3 contains = " + list3);
    }

    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        List<Integer> list3 = new LinkedList<>();
        if (list1.size() < list2.size()) {
            int temp = 0;
            for (int i = 0; i < list2.size(); i++) {
                if (i < list1.size()) {
                    temp = list1.get(i);
                    list3.add(temp);
                }
                temp = list2.get(i);
                list3.add(temp);
            }
        } else {
            int temp = 0;
            for (int i = 0; i < list1.size(); i++) {
                temp = list1.get(i);
                list3.add(temp);
                if (i < list2.size()) {
                    temp = list2.get(i);
                    list3.add(temp);
                }
            }
        }
        return list3;
    }
}
