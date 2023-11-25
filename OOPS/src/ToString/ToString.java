package ToString;

public class ToString {
    String name,subject;
    int price;

    public ToString(String n,String s,int p) {
        name=n;
        subject=s;
        price=p;
        
    }
    public static void main(String args[]){
        ToString t=new ToString("Boook","C",150);
                System.out.print(t);
    }
    public String toString(){
        return String.format("name=%s,subject=%s,price=%s",name,subject,price);
    }
    
}
