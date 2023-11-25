package ExceptionHandling;
public class ExceptionHandlingRout {
    public static void main(String args[]) throws MyException{
        System.out.println("Starting main");
        F1();
        System.out.println("Ending Main");
    }
    public static void F1() throws MyException{
        System.out.println("Starting F1");
        F2();
        System.out.println("Ending F1");
    }
    public static void F2() throws MyException{
        System.out.println("Starting F2");
        F3();
        System.out.println("Ending F2");
    }
    public static void F3() throws MyException{
        System.out.println("Starting F3");
        throw new MyException();
    }
}
