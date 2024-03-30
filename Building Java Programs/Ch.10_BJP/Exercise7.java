// Exercise 7:
// Write a method called removeDuplicates that takes as a parameter a sorted ArrayList of strings
// and eliminates any duplicates from the list.

import java.util.*;

public class Exercise7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("be");
        list.add("be");
        list.add("is");
        list.add("not");
        list.add("or");
        list.add("question");
        list.add("that");
        list.add("the");
        list.add("to");
        list.add("to");

        System.out.println("List before removeDuplicates is called = " + list);
        removeDuplicates(list);
        System.out.println("List after removeDuplicates is called = " + list);
    }

    public static void removeDuplicates(ArrayList<String> list) {
        if (list.size() == 0) {
            return;
        }
        String temp = null;
        for (int i = list.size()-1; i >= 0; i--) {
            if (i - 1 >= 0) {
                temp = list.get(i - 1);
                if (list.get(i).equals(temp)) {
                    list.remove(i-1);
                }
            }
        }
    }
}
