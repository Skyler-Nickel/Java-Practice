// This program test the time span class

public class TimeSpanMain {
    public static void main(String[] args) {
        // Test constructor, toString(), and add(int h, int minutes)
        TimeSpan t1 = new TimeSpan(1, 30);
        String s1 = t1.toString();
        System.out.println(s1);
        t1.add(1, 30);
        s1 = t1.toString();
        System.out.println(s1);
        System.out.println();

        // Test add(TimeSpan span)
        TimeSpan t2 = new TimeSpan(1, 30);
        t1.add(t2);
        s1 = t1.toString();
        System.out.println(s1);
        System.out.println();

        // Test subtract(TimeSpan span)
        t1.subtract(t2);
        //t1.subtract(t1);
        s1 = t1.toString();
        System.out.println(s1);
        System.out.println();

        // Test scale(int factor)
        t1.scale(1);
        s1 = t1.toString();
        System.out.println(s1);
        t1.scale(3);
        s1 = t1.toString();
        System.out.println(s1);
        System.out.println();
        

    }    
}
