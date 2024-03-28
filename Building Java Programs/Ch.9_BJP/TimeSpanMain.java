// this client test the implementation of equals method in TimeSpan


public class TimeSpanMain {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(1, 30);
        TimeSpan t2 = new TimeSpan(1, 30);
        TimeSpan t3 = new TimeSpan(0, 45);
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
    }
}
