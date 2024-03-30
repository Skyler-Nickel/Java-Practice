// Exercise 13:
// Write a method called reverse3 that accepts an ArrayList of integer values as a parameter and
// reverses each successive sequence of three values in the list. If the list has extra values that
// are not part of a sequence of three, those values are unchanged.

import java.util.*;

public class Exercise13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(19);
        list.add(42);
        list.add(7);
        list.add(26);
        list.add(19);
        list.add(-8);

        System.out.println("List before reverse3 is called = " + list);
        reverse3(list);
        System.out.println("List after reverse3 is called = " + list);
    }

    public static void reverse3(ArrayList<Integer> list) {
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < list.size(); i+=3) {
            if (i + 2 < list.size()) {
                temp1 = list.get(i);
                temp2 = list.get(i+2);
                list.set(i, temp2);
                list.set(i+2, temp1);
            }
        }
    }
}
