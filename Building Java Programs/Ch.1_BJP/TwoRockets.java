public class TwoRockets {
    public static void cone() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }
    public static void box() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
    public static void middle() {
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }
    public static void main(String[] args) {
        cone();
        box();
        middle();
        box();
        cone();
    }    
}
