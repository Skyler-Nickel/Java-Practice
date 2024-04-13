// Test accessor and mutator methods in ArrayIntList
// Note:
// There is a lot of redundancy in creating ArrayIntList in main but
// I followed the book examples for some test for the output


public class ArrayIntListClient {
    public static void main(String[] args) {
        int[] data = {1, 18, 2, 7, 18, 39, 18, 40};
        int[] data2 = {11, -7, 3, 42, 0, 14};
        int[] data3 = {3, 42, 0};
        int[] data4 = {11, -7, 3, 42, 3, 0, 14, 3};
        int[] data6 = {11, -7, 3, 42, 0, 14, 56};
        int[] data7 = {2, 3, 5, 4, 7, 15, 20, 7};
        int[] data8 = {42, -7, 3, 0, 15};
        int[] data9 = {3, 8, 2, 5, 19, 24, -3, 0, 4, 4, 8, 205, 42};
        int[] data10 = {7, 42, 308, 409, 19, 17, 2};
        int[] data11 = {2, -3, 2, 0, 5, 2, 2, 6};

        ArrayIntList list = new ArrayIntList();
        ArrayIntList list2 = new ArrayIntList();
        ArrayIntList list3 = new ArrayIntList();
        ArrayIntList list4 = new ArrayIntList();
        ArrayIntList list5 = new ArrayIntList();
        ArrayIntList list6 = new ArrayIntList();
        ArrayIntList list7 = new ArrayIntList();
        ArrayIntList list8 = new ArrayIntList();
        ArrayIntList list9 = new ArrayIntList();
        ArrayIntList list10 = new ArrayIntList();
        ArrayIntList list11 = new ArrayIntList();

        addData(list, data);
        addData(list2, data2);
        addData(list3, data3);
        addData(list4, data4);
        addData(list6, data6);
        addData(list7, data7);
        addData(list8, data8);
        addData(list9, data9);
        addData(list10, data10);
        addData(list11, data11);
        
        testLastIndexOf(list);
        
        testIndexOfSubList(list4, list2);
        testIndexOfSubList(list2, list3);

        testReplaceAll(list4);

        testReverse(list5);
        testReverse(list6);

        testRunningTotal(list7);

        testFill(list8, 2);

        testIsPairwiseSorted(list9);
        testIsPairwiseSorted(list10);

        testCount(list11, 2);

    }

    public static void addData(ArrayIntList list, int[] data) {
        for (int i: data) {
            list.add(i);
        }
        System.out.println("List = " + list.toString());
        System.out.println();
    }

    public static void testReplaceAll(ArrayIntList list) {
        System.out.println("List before replaceAll = " + list.toString());
        list.replaceAll(3, 999);
        System.out.println("List after replaceAll = " + list.toString());
        System.out.println();
    }

    public static void testLastIndexOf(ArrayIntList list) {
        System.out.println("Last Index Of = " + list.lastIndexOf(18));
        System.out.println("Last Index Of = " + list.lastIndexOf(3));
        System.out.println("Last Index Of = " + list.lastIndexOf(40));
        System.out.println();
    }

    public static void testIndexOfSubList(ArrayIntList list, ArrayIntList list2) {
        System.out.println("SubList index = " + list.indexOfSubList(list2));
        System.out.println();
    }

    public static void testReverse(ArrayIntList list) {
        System.out.println("The list before reverse = " + list.toString());
        list.reverse();
        System.out.println("The list after reverse = " + list.toString());
        System.out.println();
    }

    public static void testRunningTotal(ArrayIntList list) {
        System.out.println("The original list = " + list.toString());
        ArrayIntList list2 = list.runningTotal();
        System.out.println("The new list = " + list2.toString());
        System.out.println();
    }

    public static void testFill(ArrayIntList list, int value) {
        System.out.println("The list before fill = " + list.toString());
        list.fill(value);
        System.out.println("The list after fill = " + list.toString());
        System.out.println();
    }

    public static void testIsPairwiseSorted(ArrayIntList list) {
        System.out.println("The list = " + list.toString());
        System.out.println(list.isPairwiseSorted());
        System.out.println();
    }

    public static void testCount(ArrayIntList list, int value) {
        System.out.println("The count of " + value + " in the list is " + list.count(value));
        System.out.println();
    }
}
