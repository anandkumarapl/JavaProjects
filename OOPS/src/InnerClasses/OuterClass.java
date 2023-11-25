package InnerClasses;
public class OuterClass {
InnerClass ic=new InnerClass();
private class InnerClass
{
InnerClass ic=new InnerClass();
 OuterClass oc=new OuterClass();
}
 public static void main(String[] args) {
 OuterClass oc=new OuterClass();
 oc.new InnerClass();
 OuterClass.InnerClass ic= new OuterClass().new InnerClass();
 }
}
