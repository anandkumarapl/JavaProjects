package HI;
public class HirericalInheritance {
void eat(){
    System.out.println("Eating");
}    
}
class Dog extends HirericalInheritance{
    void bark(){
        System.out.println("Barking");
    }
}
    class cat extends HirericalInheritance{
       void mew(){
           System.out.println("Mewing");
       } 
public static void main(String args[]){
cat c=new cat();
c.eat();
c.mew();
}

    }