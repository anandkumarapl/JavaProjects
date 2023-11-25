package javaprograms;
public class PrimeNumbersFrom1To100 {
public static void main(String args[]){
    int n=100;
    int m=0,flag=0,i;
    m=n/2;
    if(n==0||n==1){
       System.out.print(n+"Not Prime");
    }
    else{
        for(i=2;i<=m;i++){
            if(n%i==0){
                System.out.print(n+"Not Prime");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.print(n+"Prime");
        }
    }
}    
}
