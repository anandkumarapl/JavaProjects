package GarbageCollector;
public class UseGarbageCollector {
    public static void main(String args[]){
        Person p1=new Person("Anand");
        p1=null;
System.gc();
Runtime.getRuntime().gc();
    }
}
