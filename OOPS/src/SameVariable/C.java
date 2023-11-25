package SameVariable;
public class C {
public C(){
    System.out.println("Zero parameter Constructor");
}    
}
 class D extends C{
    public D(){
        System.out.println("Zero parameter Constructor");
    }
public static void main(String args[]){
D d=new D();
System.out.print(d);
}
 }