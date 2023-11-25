package Program.Pattern;

public class Box {

    public static void main(String args[]) {
        int i, space = 0;
        for (i = 1; i <= 5; i++) {
            System.out.print("*" + " ");
        }
        System.out.println("");
        for (i = 1; i <= 5; i++) {
            System.out.print("*");
            for (space = 0; space <= 6; space++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (i = 1; i <= 5; i++) {
            System.out.print("*" + " ");
        }
    }
}
