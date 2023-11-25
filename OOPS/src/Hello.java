public class Hello {
public static void printHello(int n,String message,String name)
 {
 for(int i=1;i<=n;i++)
 System.out.println(message);
 }
 public static void main(String[] args) {
 printHello(1,"Hello","anand");
 printHello(2,"Hi","Amit");
 printHello(3,"Bye","Sudhanshu");    
}
}