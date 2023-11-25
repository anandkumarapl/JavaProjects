package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Anand {
    String name,address;
    int age,mobileno;

    public Anand(String name,String address,int age,int mobileno) {
        this.name=name;
        this.address=address;
        this.age=age;
        this.mobileno=mobileno;
    }

    @Override
    public String toString() {
        return "Anand{" + "name=" + name + ", address=" + address + ", age=" + age + ", mobileno=" + mobileno + '}';
    }
   public static void main(String args[]){
       // Book b1=new Book("C","C",120);
        //System.out.print(b1);
        try{
        Anand[] anand={new Anand("Komal","Anand",1000,653472),new Anand("Dubey","Pal",000,763281)};
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("books.txt"));
        out.writeObject(anand);
        out.flush();
         out.close();
        }
        catch(IOException ex){
            System.out.println(ex);
        }
    }
}