public class Book {
    String bookname,subject;
    int price;
    Book(String b,String s,int p){
        bookname=b;
        subject=s;
        price=p;
    }
    public void display(){
        System.out.printf("bookname=%s,subject=%s,price=%s",bookname,subject,price);
    }
    public static void main(String args[]){
        Book b1=new Book("Basic C","C",150);
        b1.display();
    }
}
