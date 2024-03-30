// Exercise 15:
// Write a method called filterRange that accepts an ArrayList of integers and two integer values
// min and max as parameters and removes all elements whose values are in range min through max(inclusive).

import java.util.*;

public class Exercise15 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(7);
        list.add(7);
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(7);

        System.out.println("List before filterRange is called = " + list);
        filterRange(list, 5, 7);
        System.out.println("List after filterRange is called = " + list);
    }

    public static void filterRange(ArrayList<Integer> list, int min, int max) {
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            if (temp >= min && temp <= max) {
                list.remove(i);
                i--;
            }
        }
    }
}
