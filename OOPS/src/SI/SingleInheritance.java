package SI;



public class SingleInheritance{
void eat(){
    System.out.println("Eating");
}
}
class Dog extends SingleInheritance{
    void bark(){
        System.out.println("Barking");
    }
}

class test{
    public static void main(String args[]){
        Dog d=new Dog();
        d.bark();
        d.eat();
        
    }
}

