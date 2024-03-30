// Exercise 6:
// Write a method called minToFront that takes an ArrayList of integers as a parameter
// and moves the minimum value in the list to the front, otherwise preserving the order of the
// elements.

import java.util.*;

public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(92);
        list.add(4);
        list.add(2);
        list.add(17);
        list.add(9);

        System.out.println("List before calling minToFront = " + list);
        minToFront(list);
        System.out.println("List after called minToFront = " + list);
    }

    public static void minToFront(ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
                index = i;
            }
        }
        list.remove(index);
        list.add(0, min);
    }
}
