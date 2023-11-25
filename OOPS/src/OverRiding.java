public class OverRiding {
    void eat(){
        System.out.print("eating");
    }
    void eat(int x){//overloading
        System.out.print(x);
        
}
}
class Dog extends OverRiding{
   void eat(){//overriding
      System.out.println("Crying");
   }
    public static void main(String args[]){
        Dog d=new Dog();
        d.eat();
        OverRiding O=new OverRiding();
        O.eat();
    }
}

