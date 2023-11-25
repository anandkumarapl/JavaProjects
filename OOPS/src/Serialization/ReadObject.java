package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
 public static void main(String[] args) {
 try
 {
 ObjectInputStream in=new ObjectInputStream(new FileInputStream("books.txt"));
 Book[] books=(Book[])in.readObject();
 in.close();
 for(Book book : books)
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