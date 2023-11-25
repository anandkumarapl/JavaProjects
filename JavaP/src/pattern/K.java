package pattern;
public class K {
    public static void main(String args[]){
        int i,j,k,l,m;
        for(i=0;i<4;i++){
            for(j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(i=4;i>=0;i--){
            for(j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
         for(k=1;k<=1;k++){
              System.out.print(" ");
        }
         
        for(i=2;i<=4;i++){
              System.out.print("*");
        }
        System.out.println("");
          for(i=0;i<=4;i++){
              System.out.print("*");
              for(j=0;j<=2;j++){
              System.out.print(" ");
          }
              for(k=1;k<=1;k++){
              System.out.print("*");
         }
               
              System.out.println("");
          }
        for(k=1;k<=1;k++){
              System.out.print(" ");
        }
         
        for(i=2;i<=4;i++){
              System.out.print("*");
        }
        
        System.out.println(" ");
         System.out.println(" ");
        
        for(i=0;i<=4;i++){
            System.out.print("*");
             for(j=1;j<=i;j++){
                System.out.print("0");
            }
             for(k=1;k>=1;k--){
            System.out.print("*");
             }
             
             for(l=5;l>=1;l--){
                 System.out.print(" ");
             for(m=1;m<=l;m++){
                 System.out.print("*");
             }
             }
             System.out.println("");
        }
        
      
    }
}
