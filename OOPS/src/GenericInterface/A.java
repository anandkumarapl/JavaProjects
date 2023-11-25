package GenericInterface;
public class A<T>{
    T name;
    void add(T name){
        this.name=name;
    }
    T get(){
        return name;
    }
}
