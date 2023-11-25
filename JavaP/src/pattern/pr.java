package pattern;
public class pr {
    public static void main(String args[]){
        int i,j,k;
        for(i=5;i>=1;i--){
            for(k=i;k<=4;k++){
                System.out.print("0");
            }
            for(j=i-1;j>=0;j--){
                System.out.print("* ");
            }
            for(k=i;k<=4;k++){
                System.out.print("0");
            }
            System.out.println("");
        }
    }
}
