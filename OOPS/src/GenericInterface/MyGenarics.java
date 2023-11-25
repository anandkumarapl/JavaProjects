
package GenericInterface;
public class MyGenarics {
 public static void main(String args[]){
     MyGen<Integer>m=new MyGen<>();
     m.add(2);
     System.out.println(m.get());
 }   
}
