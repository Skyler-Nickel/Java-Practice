public class SlashFigure {
    public static void main(String[] args) {
        int slash = 0;
        int mark = 22;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < slash; j++) {
                System.out.print("\\");
            }
            for (int j = 0; j < mark; j++) {
                System.out.print("!");
            }
            for (int j = 0; j < slash; j++) {
                System.out.print("/");
            }
            System.out.println();
            slash+=2;
            mark-=4;
        }
    }
}
