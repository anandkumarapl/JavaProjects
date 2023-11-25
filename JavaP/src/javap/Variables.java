
package javap;
public class Variables {
     int a=10; //instance variable
     static double b=20.5;//static
    public static void main(String[] args) {
      boolean c=true;//local 
      Variables V=new Variables();
      System.out.println(V.a+" "+b+" "+c);
    }
    
    
}
