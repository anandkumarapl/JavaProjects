package Generics;
public class Generic<T> {
    T t;

    public Generic(T t) {
        this.t=t;
    }
    public void print(){
        System.out.println(t.getClass());
    }

    @Override
    public String toString() {
        return "Generic{" + "t=" + t + '}';
    }
    public static void main(String args[]){
        Generic<Integer> g=new Generic<>(5);
        System.out.println(g);
        g.print();
        Generic<String> n=new Generic<>("Anand");
        System.out.println(n);
        n.print();
    }
}
