// Exercise 2:
// Write a method called swapPairs that switches the order of values in an ArrayList
// of strings in a pairwise fashion. Your method should switch the order of the first
// two values, then switch the order of the next two, then the next two, and so on.
// If the number of values in the list is odd, the method should not move the final element.

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("to");
        list.add("be");
        list.add("or");
        list.add("not");
        list.add("to");
        list.add("be");
        list.add("hamlet");

        System.out.println("List before swapPairs = " + list);
        swapPairs(list);
        System.out.println("List after swapPairs = " + list);
    }

    public static void swapPairs(ArrayList<String> list) {
        if (list.size() % 2 == 0) {
            for (int i = 0; i < list.size(); i+=2) {
                String s = list.get(i);
                String s2 = list.get(i+1);
                list.set(i, s2);
                list.set(i+1, s);
            }
        } else {
            for (int i = 0; i < list.size()-1; i+=2) {
                String s = list.get(i);
                String s2 = list.get(i+1);
                list.set(i, s2);
                list.set(i+1, s);
            }
        }
    }
}
