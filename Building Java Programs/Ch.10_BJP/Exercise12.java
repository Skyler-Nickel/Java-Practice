// Exercise 12:
// Write a method called markLength4 that accepts an ArrayList of strings as a parameter and that
// places a string of four astericks "****" in front of every string of length 4.

import java.util.*;

public class Exercise12 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("this");
        list.add("is");
        list.add("lots");
        list.add("of");
        list.add("fun");
        list.add("for");
        list.add("Java");
        list.add("coders");

        System.out.println("List before markLength4 is called = " + list);
        markLength4(list);
        System.out.println("List after markLength4 is called = " + list);
    }

    public static void markLength4(ArrayList<String> list) {
        for (int i = list.size()-1; i >= 0; i--) {
            String s = list.get(i);
            if (s.length() == 4) {    
                list.add(i, "****");
            }
        }
    }
}
