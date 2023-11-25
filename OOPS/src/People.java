public class People {
   String name,Address;
   int age;

    public People(String n,String a,int age) {
        name=n;
        Address=a;
        this.age=age;
    }
   public String toString(){
    return "name="+name+","+"Address="+Address+","+"age="+age;
}
  
}
