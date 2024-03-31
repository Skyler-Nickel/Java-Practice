// Exercise 18:
// Write a method called mirror that accepts an ArrayList of strings as a parameter and produces a
// mirrored copy of the list as output, with the original values followed by those same values in
// opposite order. 

import java.util.*;

public class Exercise18 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println("List before mirror called = " + list);
        mirror(list);
        System.out.println("List after mirror called = " + list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("H");
        list2.add("e");
        list2.add("l");
        list2.add("l");
        list2.add("o");

        System.out.println("List before mirror called = " + list2);
        mirror(list2);
        System.out.println("List after mirror called = " + list2);
    }

    public static void mirror(ArrayList<String> list) {
        for (int i = list.size()-1; i >= 0; i--) {
            String temp = list.get(i);
            list.add(temp);
        }
    }
}
