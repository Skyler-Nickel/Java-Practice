// Exercise 11:
// Write a method called stutter that accepts an ArrayList of strings and an integer k as parameters
// and that replaces every string with k copies of that string.


import java.util.*;

public class Exercise11 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("how");
        list.add("are");
        list.add("you?");

        System.out.println("List before stutter is called = " + list);
        stutter(list, 4);
        System.out.println("List after stutter is called = " + list);
    }

    public static void stutter(ArrayList<String> list, int k) {
        for (int i = list.size()-1; i >= 0; i--) {
            String temp = list.get(i);
            for (int j = 1; j < k; j++) {
                list.add(i, temp);
            }
        }
    }
}
