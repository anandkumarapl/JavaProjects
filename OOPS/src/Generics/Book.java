package Generics;

import java.util.Scanner;

public class Book implements GenericSearchable{
private final Scanner s;
private String bookid,bookname,subject;
private int price;
public Book(String bookid, String bookname, String subject, int price)
{
this.s = new Scanner(System.in);
this.bookid = bookid;
this.bookname = bookname;
this.subject = subject;
this.price = price;
}

    @Override
    public String toString() {
        return "Book{" + "s=" + s + ", bookid=" + bookid + ", bookname=" + bookname + ", subject=" + subject + ", price=" + price + '}';
    }

@Override
public String key()
{
return bookid;
}
}
