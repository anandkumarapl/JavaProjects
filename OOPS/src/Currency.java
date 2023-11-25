public class Currency {
int paisa;
    public Currency(int r,int p) {
        paisa=100*r+p;
    }
public String toString(){
   int r=paisa/100;
   int p=paisa%100;
   return String.format("%s.%s",r,p);
}
public static void main(String args[]){
    Currency C=new Currency(100,555);
    System.out.print(C);
}
}
