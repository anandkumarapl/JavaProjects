package Package1;


public class Packageone {
    public static void fStatic(){
        System.out.println("Static one");
    }
    public void fInstance(){
        System.out.println("Instance one");
    }
    public static void main(String args[]){
        Packageone p=new Packageone();
        p.fInstance();
        fStatic();
    }
}
