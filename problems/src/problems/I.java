package problems;
public class I {
    public static void main(String args[]){
       int i,j;
       int n=5,sum;
       for(i=0;i<=n;i++){
           for(sum=n-i;sum>=0;sum--){
               System.out.print(" ");
           }
       for(j=0;j<=i;j++){
           System.out.print("* ");
       }
           System.out.println("");
       }
    }}