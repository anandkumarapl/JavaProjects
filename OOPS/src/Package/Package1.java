package Package;

public class Package1 {
    String name;
    int a,b,c;

    public Package1(String name,int a,int b,int c) {
    this.name=name;
    this.a=a;
    this.b=b;
    this.c=c;
    }

    @Override
    public String toString() {
        return "Package1{" + "name=" + name + ", a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
}
