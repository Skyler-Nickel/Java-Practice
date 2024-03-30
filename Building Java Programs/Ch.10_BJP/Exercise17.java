// Exercise 17:
// Write a method called interleave that accepts two ArrayLists of integers a1 and a2 as parameters
// and inserts the elements of a2 into a1 at alternating indexes. If the list are of unequal length
// the remaining elements of the longer list are left at the end of a1.

import java.util.*;

public class Exercise17 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        
        // Case when a2 is longer
        ArrayList<Integer> list2 = new ArrayList<>(List.of(4, 5, 6, 7, 8));
        System.out.println("List1 before the call to interleave = " + list1);
        interleave(list1, list2);
        System.out.println("List1 after the call to interleave = " + list1);

        // Case when a1 is longer
        ArrayList<Integer> list3 = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        
        ArrayList<Integer> list4 = new ArrayList<>(List.of(6, 7, 8));
        System.out.println("List3 before the call to interleave = " + list3);
        interleave(list3, list4);
        System.out.println("List3 after the call to interleave = " + list3);

        // Case when list are of equal length
        ArrayList<Integer> list5 = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        
        ArrayList<Integer> list6 = new ArrayList<>(List.of(6, 7, 8, 9, 10));
        System.out.println("List3 before the call to interleave = " + list5);
        interleave(list5, list6);
        System.out.println("List3 after the call to interleave = " + list5);
    }

    public static void interleave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
        if (a1.size() < a2.size()) {
            int index = 0;
            for (int i = 0; i < a1.size(); i++) {
                int temp = a2.get(index);
                a1.add(i+1, temp);
                i++;
                index++;
            }
            while (index < a2.size()) {
                int temp = a2.get(index);
                a1.add(temp);
                index++;
            }
        } else {
            int index = 0;
            for (int i = 0; i < a1.size(); i++) {
                if (index < a2.size()) {
                    int temp = a2.get(index);
                    a1.add(i+1, temp);
                    i++;
                    index++;
                }
            }
        }
    }
}
