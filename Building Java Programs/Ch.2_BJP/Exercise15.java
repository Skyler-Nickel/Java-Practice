public class Exercise15 {
    public static void printDesign() {
        int dash = 5;
        int num = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = dash; j > 0; j--) {
                System.out.print("-");
            }
            for (int j = 0; j < num; j++) {
                System.out.print(num);
            }
            for (int j = dash; j > 0; j--) {
                System.out.print("-");
            }
            System.out.println();
            dash--;
            num+=2;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printDesign();
    }

}
