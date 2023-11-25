package pattern;
public class p5 {
    public static void main(String args[]){
        int i,j,s=0,n=5;
        for(i=0;i<=n;i++){
            for(s=n-1;s>=i;s--){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
