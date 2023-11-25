package GarbageCollector;
public class Person {
    private String name;
    public Person(String name){
        this.name=name;
    }
    @Override
    public void finalize()throws Throwable{
        System.out.println(this + " is being garbage collected.");
System.out.println();
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
    
}
