package staticpackage;
public class OuterClass {
 StaticInner si=new StaticInner();
 protected static class StaticInner
 {
 OuterClass oc=new OuterClass();
 }
 public static void main(String[] args) {
 OuterClass.StaticInner si=new StaticInner();
 new OuterClass();
 }
}