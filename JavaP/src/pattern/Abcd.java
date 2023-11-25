package pattern;
public class Abcd {
    public static void main(String args[]){
        char i,j,k='a';
        for(i=0;i<=5;i++){
            for(j=0;j<i;j++){
                System.out.print(k+++" ");
            }
            System.out.println(" ");
        }
    }
}
