package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Book implements java.io.Serializable{
    String bookname,subject;
    int price;
    Book(String b,String s,int p){
        bookname=b;
        subject=s;
        price=p;
    }

    @Override
    public String toString() {
        return "Book{" + "bookname=" + bookname + ", subject=" + subject + ", price=" + price + '}';
    }
    public static void main(String args[]){
       // Book b1=new Book("C","C",120);
        //System.out.print(b1);
        try{
        Book[] books={new Book("Komal","Anand",1000),new Book("Dubey","Pal",000)};
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("books.txt"));
        out.writeObject(books);
        out.flush();
         out.close();
        }
        catch(IOException ex){
            System.out.println(ex);
        }
    }
}
