public class Super{
    public Super(int x){
        System.out.print(x);
    }
}

class D extends Super{
    public D(){
        super(10);
    }

public static void main(String args[]){
    new D();
}
}
