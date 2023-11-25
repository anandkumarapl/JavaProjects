
package problems;
public class swaptwonumberswithoutusingathirdvariable {
    public static void main(String[] args) {
        int a=10,b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("a="+a+ " b="+b);
    }
}
