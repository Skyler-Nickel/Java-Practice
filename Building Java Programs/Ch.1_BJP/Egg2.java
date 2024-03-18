public class Egg2 {
    public static void top() {
        System.out.println("  -------  ");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }
    public static void middle() {
        System.out.println("_\"_\'_\"_\'_\"_");
    }
    public static void bottom() {
        System.out.println("\\         /");
        System.out.println(" \\       /");
        System.out.println("  -------");
    }
    public static void main(String[] args) {
        top();
        bottom();
        System.out.println();
        middle();
        System.out.println();
        top();
        bottom();
        System.out.println();
        middle();
        bottom();
        System.out.println();
        System.out.println();
        top();
        middle();
        bottom();
    }    
}
