// Exercise 3:
// Write a method called removeInRange that accepts four parameters: a LinkedList, an element value, a starting
// index, and an ending index. The method's behavior is to remove all occurrences of the given element
// that appear in the list between the starting index(inclusive) and the ending index(exclusive). Other
// values and occurrences of the given value that appear outside the given index range are not affected.

import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(List.of(0, 0, 2, 0, 4, 0, 6,
        0, 8, 0, 10, 0, 12, 0, 14, 0, 16));
        System.out.println("The list before calling removeInRange = " + list);
        removeInRange(list, 0, 5, 13);
        System.out.println("The list after calling removeInRange = " + list);
    }

    public static void removeInRange(List<Integer> list, int ele, int sIndex, int eIndex) {
        Iterator<Integer> itr = list.iterator();
        for (int i = 0; i < sIndex; i++) {
            itr.next();
        }
        for (int i = sIndex; i < eIndex; i++) {
            if (itr.next() == ele) {
                itr.remove();
            }
        }
    }
}
