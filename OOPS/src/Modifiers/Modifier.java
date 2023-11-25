package Modifiers;


public class Modifier {
public String name;
private int age;
protected int pass;
String City;

    public Modifier(String name,int age,int pass,String City) {
this.name=name;
this.age=age;
this.pass=pass;
this.City=City;
    }

    @Override
    public String toString() {
        return "Modifier{" + "name=" + name + ", age=" + age + ", pass=" + pass + ", City=" + City + '}';
    }

    
public static void main(String args[]){
    Modifier m=new Modifier("anand",23,12345,"Noida");
    System.out.println(m);
}
}

