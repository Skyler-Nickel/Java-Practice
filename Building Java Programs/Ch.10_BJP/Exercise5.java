// Exercise 5:
// Write a method called scaleByK that takes an ArrayList of integers as a parameter and replaces
// every integer of value k with k copies of itself.

import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(3);

        System.out.println("List before scaleByK is called  = " + list);
        scaleByK(list);
        System.out.println("List after scaleByK is called = " + list);
    }

    public static void scaleByK(ArrayList<Integer> list) {
        int scale = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            scale = list.get(i);
            if (scale <= 0) {
                list.remove(i);
            } else {
                for (int j = 0; j < scale-1; j++) {
                    list.add(i, scale);
                } 
            }
        }
    }
}
