package javap;

public class NestedIfElseIf {

    public static void main(String args[]) {
        int a = 100, b = 200, c = 30;
        if (a > b) {
            if (a > c) {
                System.out.println(a+"A is grater");
            }
        else {
            System.out.print(c+"C is grater");
        }
        }
        else{
                if(b>c){
                    System.out.println(b+"b is grater");
                }
                else{
                    System.out.println(c+"c is grater");
                }
                }
                }
    }
