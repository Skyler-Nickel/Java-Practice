public class Lanterns {
    public static void top() {
        System.out.println("    *****");
        System.out.println("  *********");
        System.out.println("*************");
    }
    public static void middle() {
        System.out.println("* | | | | | *");
    }
    public static void bottom() {
        System.out.println("*************");
    }
    public static void shortL() {
        System.out.println("    *****");
    }
    public static void main(String[] args) {
        top();
        System.out.println();
        top();
        middle();
        bottom();
        top();
        System.out.println();
        top();
        shortL();
        middle();
        middle();
        shortL();
        shortL();
    }    
}
