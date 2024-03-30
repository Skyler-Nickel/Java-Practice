// Exercise 8:
// Write a method called removeZeroes that takes as a parameter an ArrayList of integers and
// eliminates any occurrences of the number 0 from the list.

import java.util.*;

public class Exercise8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(7);
        list.add(2);
        list.add(0);
        list.add(0);
        list.add(4);
        list.add(0);

        System.out.println("List before calling removeZeroes = " + list);
        removeZeroes(list);
        System.out.println("List after calling removeZeroes = " + list);
    }

    public static void removeZeroes(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == 0) {
                list.remove(i);
            }
        }
    }
}
