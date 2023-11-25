package pattern;
public class p8 {
    public static void main(String args[]){
       int i,j,k,n=4,l;
       for(i=0;i<=n;i++){
           for(j=0;j<=i;j++){
               System.out.print("*");
           }
               for(k=n-1;k>=i;k--){
                   System.out.print("  ");
               
           }
              for(l=0;l<=i;l++){
               System.out.print("*");
           }
           System.out.println(" ");
       }
    }
}
