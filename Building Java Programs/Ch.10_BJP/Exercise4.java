// Exercise 4:
// Write a method called doubleList that takes an ArrayList of strings as a parameter and replaces
// every string with two of that same string. 

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("how");
        list.add("are");
        list.add("you?");

        System.out.println("List before doubleList is called = " + list);
        doubleList(list);
        System.out.println("List after doubleList is called = " + list);
    }

    public static void doubleList(ArrayList<String> list) {
        for (int i = list.size()-1; i >= 0; i--) {
            String s = list.get(i);
            list.add(i+1, s);
        }
    }
}
