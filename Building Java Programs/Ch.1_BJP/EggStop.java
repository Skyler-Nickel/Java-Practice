public class EggStop {
    public static void top() {
        System.out.println("  -----");
        System.out.println(" /     \\");
        System.out.println("/       \\");
    }   
    public static void bottom() {
        System.out.println("\\       /");
        System.out.println(" \\     /");
        System.out.println("  -----");
    } 
    public static void randLine() {
        System.out.println("+-------+");
    }
    public static void main(String[] args) {
        top();
        bottom();
        bottom();
        randLine();
        System.out.println();
        top();
        System.out.println("|  STOP  |");
        bottom();
        System.out.println();
        top();
        randLine();
    }
}
