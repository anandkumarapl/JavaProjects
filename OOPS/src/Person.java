public class Person {
    String name,address;
    int age;

    public Person(String n,String add,int a) {
        name=n;
        address=add;
        age=a;
    }
    public void display(){
        System.out.printf("name=%s,address=%s,age=%s",name,address,age);
    }
    public static void main(String args[]){
        Book b1=new Book("Anand","Panchkoshi",23);
        b1.display();
    }
}
