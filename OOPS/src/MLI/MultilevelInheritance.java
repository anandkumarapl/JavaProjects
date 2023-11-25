package MLI;


public class MultilevelInheritance {
void eat(){
    System.out.println("Eating");    
    }
}
class Dog extends MultilevelInheritance{
    void bark(){
        System.out.println("Barking");
    }
}
    class Dogchild extends Dog{
        void cry(){
            System.out.println("Crying");
        }}
class a{
public static void main(String args[]){
   Dogchild d=new Dogchild();
    d.bark();
    d.eat();
    d.cry();
}
}
