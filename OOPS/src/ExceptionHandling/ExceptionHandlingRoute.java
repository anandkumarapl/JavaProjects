package ExceptionHandling;
public class ExceptionHandlingRoute {
public static void main(String args[]){
    System.out.println("Starting Main");
    f1();
    
    System.out.print("Ending main");
}    
public static void f1(){
    System.out.println("Starting F1");
    f2();
    System.out.println("Ending F1");
}
public static void f2(){
    System.out.println("Starting F2");
    f3();
    System.out.println("Ending F2");
}
public static void f3(){
    System.out.println("Starting F3");
    try{
    int n=0;
    n=n/n;
    }
    catch(Exception ex){
        System.out.println(ex);
    }
    System.out.println("Ending F3");
}
}
