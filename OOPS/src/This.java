public class This {
String name;
int a,b,c;

public This(String name,int a,int b,int c){
    
this.name=name;
this.a=a;
this.b=b;
this.c=c;
}

    public This() {
        {
           
        System.out.print("hello");
    }
    }

    @Override
    public String toString() {
        return "This{" + "name=" + name + ", a=" + a + ", b=" + b + ", c=" + c + '}';
    
}
    public static void main(String args[]){
        This t=new This("anand",1,2,3);
        System.out.print(t);
    }
}

