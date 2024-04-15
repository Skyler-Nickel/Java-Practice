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
}
