// Client program to test LinkedIntList

public class LinkedIntListClient {
    public static void main(String[] args) {
        int[] data1 = {1, 2, 3, 4, 5};
        int[] data2 = {10, 5, 2, 8, 100};
        int[] data3 = {1, 2, 3, 4, 5, 6, 7};
        int[] data4 = {1, 18, 2, 7, 39, 18, 40};
        int[] data5 = {1, 1, 1, 3, 3, 6, 9, 15, 15, 23, 23, 23, 40, 40};
        int[] data6 = {1, 18, 2, 7, 8, 39, 40};
        int[] data7 = {10, 25, 31, 47, 52, 68, 77};
        int[] data8 = {1, 8, 19, 4, 17};
        int[] data9 = {18, 7, 4, 24, 11};
        int[] data10 = {1, 7, 3, 9, 4, 6, 5, 5};
        int[] data11 = {8, 7, -4, 19, 0, 43, -8, -7, 2};
        int[] data12 = {8, 17, 2, 4};
        int[] data13 = {1, 2, 3};
        int[] data14 = {1, 2, 3};
        int[] data15 = {3, 9, 4, 2, 3, 8, 17, 4, 3, 18};
        int[] data16 = {3};
        int[] data17 = {8, 13, 17, 4, 9, 12, 98, 41, 7, 23, 0, 92};
        

        LinkedIntList list1 = new LinkedIntList();
        LinkedIntList list2 = new LinkedIntList();
        LinkedIntList list3 = new LinkedIntList();
        LinkedIntList list4 = new LinkedIntList();
        LinkedIntList list5 = new LinkedIntList();
        LinkedIntList list6 = new LinkedIntList();
        LinkedIntList list7 = new LinkedIntList();
        LinkedIntList list8 = new LinkedIntList();
        LinkedIntList list9 = new LinkedIntList();
        LinkedIntList list10 = new LinkedIntList();
        LinkedIntList list11 = new LinkedIntList();
        LinkedIntList list12 = new LinkedIntList();
        LinkedIntList list13 = new LinkedIntList();
        LinkedIntList list14 = new LinkedIntList();
        LinkedIntList list15 = new LinkedIntList();
        LinkedIntList list16 = new LinkedIntList();
        LinkedIntList list17 = new LinkedIntList();


        add(data1, list1);
        add(data2, list2);
        add(data3, list3);
        add(data4, list4);
        add(data5, list5);
        add(data6, list6);
        add(data7, list7);
        add(data8, list8);
        add(data9, list9);
        add(data10, list10);
        add(data11, list11);
        add(data12, list12);
        add(data13, list13);
        add(data14, list14);
        add(data15, list15);
        add(data16, list16);
        add(data17, list17);


        testSet(list1, 2, 10);

        testMin(list1);
        testMin(list2);

        testIsSorted(list2);
        testIsSorted(list3);

        testLastIndexOf(list4, 18);
        testLastIndexOf(list4, 3);

        testCountDuplicates(list5);

        testHasTwoConsec(list6);
        testHasTwoConsec(list4);

        testDeleteBack(list1);

        testSwitchPairs(list7);

        testStutter(list8);

        testStretch(list9, 3);

        testCompress(list10);

        testSplit(list11);

        testTransferFrom(list12, list13);

        testEquals(list13, list14);
        testEquals(list14, list12);

        testRemoveAll(list15, 3);
        testRemoveAll(list16, 3);

        testRemoveEvens(list17);
    }

    public static void add(int[] data, LinkedIntList list) {
        for (int i: data) {
            list.add(i);
        }
    }

    public static void testSet(LinkedIntList list, int index, int value) {
        System.out.println("The List before = " + list.toString());
        list.set(index, value);
        System.out.println("The List after = " + list.toString());
        System.out.println();
    }

    public static void testMin(LinkedIntList list) {
        System.out.println("The List = " + list.toString());
        System.out.println("The min element = " + list.min());
        System.out.println();
    }

    public static void testIsSorted(LinkedIntList list) {
        System.out.println("The List = " + list.toString());
        System.out.println(list.isSorted());
        System.out.println();
    }

    public static void testLastIndexOf(LinkedIntList list, int value) {
        System.out.println("The List = " + list.toString());
        System.out.println("The last index of " + value + " = " + list.lastIndexOf(value));
        System.out.println();
    }

    public static void testCountDuplicates(LinkedIntList list) {
        System.out.println("The List = " + list.toString());
        System.out.println("Duplicates = " + list.countDuplicates());
        System.out.println();
    }

    public static void testHasTwoConsec(LinkedIntList list) {
        System.out.println("The List = " + list.toString());
        System.out.println("Contains consecutive = " + list.hasTwoConsecutive());
        System.out.println();
    }

    public static void testDeleteBack(LinkedIntList list) {
        System.out.println("The List = " + list.toString());
        System.out.println("The number removed = " + list.deleteBack());
        System.out.println("The List = " + list.toString());
        System.out.println();
    }

    public static void testSwitchPairs(LinkedIntList list) {
        System.out.println("The List = " + list.toString());
        list.switchPairs();
        System.out.println("The List = " + list.toString());
        System.out.println();
    }

    public static void testStutter(LinkedIntList list) {
        System.out.println("The List = " + list.toString());
        list.stutter();
        System.out.println("The List = " + list.toString());
        System.out.println();
    }

    public static void testStretch(LinkedIntList list, int value) {
        System.out.println("The List = " + list.toString());
        list.stretch(value);
        System.out.println("The List = " + list.toString());
        System.out.println();
    }

    public static void testCompress(LinkedIntList list) {
        System.out.println("The List = " + list.toString());
        list.compress();
        System.out.println("The List = " + list.toString());
        System.out.println();
    }

    public static void testSplit(LinkedIntList list) {
        System.out.println("The List = " + list.toString());
        list.split();
        System.out.println("The List = " + list.toString());
        System.out.println();
    }

    public static void testTransferFrom(LinkedIntList list, LinkedIntList list2) {
        System.out.println("The List = " + list.toString());
        list.transferFrom(list2);
        System.out.println("The List = " + list.toString());
        System.out.println();
    }

    public static void testEquals(LinkedIntList list, LinkedIntList list2) {
        System.out.println("List1 = " + list.toString());
        System.out.println("List2 = " + list2.toString());
        System.out.println("Equals = " + list.equals(list2));
        System.out.println();
    }

    public static void testRemoveAll(LinkedIntList list, int value) {
        System.out.println("List = " + list.toString());
        list.removeAll(value);
        System.out.println("List = " + list.toString());
        System.out.println();
    }

    public static void testRemoveEvens(LinkedIntList list) {
        System.out.println("List = " + list.toString());
        LinkedIntList list2 = list.removeEvens();
        System.out.println("List = " + list.toString());
        System.out.println("List 2 = " + list2.toString());
        System.out.println();
    }
}
