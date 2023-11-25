
package javaprograms;
public class Diamond {
    public static void main(String args[]){
        int row=6;
        int i,j;
        for(i=0;i<row;i++){
            for(j=row-i;j>=1;j--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                  System.out.print("* ");
        }
            System.out.println("");
    }
     for(i=row;i>=0;i--){
            for(j=row-i;j>0;j--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                  System.out.print("* ");
        }
            System.out.println("");
    }
    }
    }

