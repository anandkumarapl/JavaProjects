package pattern;
public class Prymid {
    public static void main(String args[]){
        int i,j,space=1,n=7;
        for(i=1;i<n;i++){
            for(space=n-1;space>=i;space--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
            System.out.print("* ");
        }
            for(space=n-1;space>=i;space--){
                System.out.print(" ");
            }
            for(space=n-1;space>=i;space--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
            System.out.print("* ");
        }
             for(space=n-1;space>=i;space--){
                System.out.print(" ");
            }
            for(space=n-1;space>=i;space--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
            System.out.print("* ");
        }
        
        System.out.println(" ");
    }
}
}
