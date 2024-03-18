public class StarFigures {
    public static void twoRows() {
        String s = "*****";
        System.out.println(s);
        System.out.println(s);
    }
    public static void xShape() {
        String s = " * * ";
        System.out.println(s);
        System.out.println("  *  ");
        System.out.println(s);
    }
    public static void main(String[] args) {
        twoRows();
        xShape();
        System.out.println();
        twoRows();
        xShape();
        twoRows();
        System.out.println();
        String s1 = "  *  ";
        System.out.println(s1);
        System.out.println(s1);
        System.out.println(s1);
        twoRows();
        xShape(); 
    }
}
