public class WellFormed {
    public static void firstPara() {
        System.out.println("A well-formed Java program has");
        System.out.println("a main method with { and }");
        System.out.println("braces.");
    }
    public static void secondPara() {
        System.out.println("A System.out.println statement");
        System.out.println("has { and } and usually a");
        System.out.println("String that starts and ends");
        System.out.println("with a \" character.");
        System.out.println("(But we type \\\" instead!)");
    }
    public static void main(String[] args) {
        firstPara();
        System.out.println();
        secondPara();
    }    
}
