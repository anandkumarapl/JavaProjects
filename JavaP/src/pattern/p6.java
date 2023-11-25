package pattern;
public class p6 {
    public static void main(String args[]){
        int i,j,s=1,n=5;
       
             for(i=1;i<=n;i++){
            for(s=n-1;s>=i;s--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(i=n;i>=1;i--){
            for(s=n-1;s>=i;s--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
