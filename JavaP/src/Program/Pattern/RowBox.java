package Program.Pattern;
public class RowBox {
    public static void main(String args[]){
        int i,space=0;
        for(i=1;i<=3;i++){
            System.out.print("*"+" ");
        }
        
                 for(space=1;space<=2;space++){
            System.out.print(" ");
         }
            for(i=1;i<=3;i++){
            System.out.print("*"+" ");
        }
         System.out.println(" ");
        for(i=1;i<=3;i++){
            System.out.print("*"+" ");
            for(space=0;space<=1;space++){
                System.out.print(" ");
            }
        }
        System.out.println(" ");
        for(int j=1;j<=3;j++){
            System.out.print("");
         for(int k=1;k<=3;k++){
            System.out.print("*"+" ");
            for(space=0;space<=1;space++){
                System.out.print(" ");
            }
        }
            System.out.println("*");
        }
        
        
         for(i=1;i<=3;i++){
            System.out.print("*"+" ");
        }
         
         for(space=1;space<=2;space++){
            System.out.print(" ");
         }
            for(i=1;i<=3;i++){
            System.out.print("*"+" ");
        }
         
    }
}
