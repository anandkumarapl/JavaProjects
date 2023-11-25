package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadAnandObject {
   public static void main(String[] args) {
 try
 {
 ObjectInputStream in=new ObjectInputStream(new FileInputStream("anand.txt"));
 Anand[] anand=(Anand[])in.readObject();
 in.close();
 for(Anand book : anand)
 System.out.println(book);
 }
 catch(IOException ex)
 {
 System.out.println(ex);
 }
 catch(ClassNotFoundException ex)
 {
 System.out.println(ex);
}
 }
}