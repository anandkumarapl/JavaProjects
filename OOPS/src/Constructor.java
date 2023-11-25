

public class Constructor {
    public Constructor(){
        System.out.println("one");
    
    }
}

class N extends Constructor{
public N(){
            System.out.println("two");
}
}
class K extends N{
    public K(){
        System.out.println("Three");
    }

public static void main(String args[]){
      new K();
}
}
