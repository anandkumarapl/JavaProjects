
package staticpackage;
public class StaticInner {
 public static void main(String[] args) {
 OuterClass.StaticInner si=new OuterClass.StaticInner();
 new OuterClass();
 }
 @Override
 public String toString() {
 return "StaticInner";
 }
}

