import java.util.Scanner;

interface Client{
    void Input();
    void Output();
}
public class Interface implements Client{
    String name; double sailary;
    void input(){
    Scanner sc=new Scanner(System.in);
        System.out.println("Input name");
    name=sc.nextLine();
    
    System.out.println("Input name");
    sailary=sc.nextDouble();
}

    @Override
    public String toString() {
        return "Interface{" + "name=" + name + ", sailary=" + sailary + '}';
    }
    public static void main(String args[]){
        
    }

    @Override
    public void Input() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Output() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

