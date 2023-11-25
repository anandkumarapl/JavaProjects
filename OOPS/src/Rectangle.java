
import java.util.Scanner;

public class Rectangle{
    int l,b;
public Rectangle(){
   System.out.println("zero parameter constructor in Rectangle");
   l=0;
   b=0;
}
public Rectangle(int x){
    System.out.println("one parameter constructor in Rectangle");
    l=x;
    b=x;
    
}
public Rectangle(int x,int y){
    System.out.println("two parameter constructor in Rectangle");
    l=x;
    b=y;
}
public String toString(){
    return "Rectangle: l="+l+",b="+b+"Rectangle="+l*b;
}
public static void main(String args[]){
    Rectangle r1=new Rectangle();
    Rectangle r2=new Rectangle(5);
    Rectangle r3=new Rectangle(5,10);
    System.out.println(r1);
     System.out.println(r2);
      System.out.println(r3);
    
}
}
