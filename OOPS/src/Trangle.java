public class Trangle {
    int a,b,c;
    public Trangle(int side1,int side2,int side3){
    a=side1;
    b=side2;
    c=side3;
}
    @Override
    public String toString(){
       return "Trangle{"+"a="+a+"b="+b+"c="+c+"}";
    }
    public static void main(String args[]){
        Trangle t1=new Trangle(12,34,10);
        System.out.println(t1);
}
}
