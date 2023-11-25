package pattern.P;
public class pattern10 {
public static void main(String args[]){
    int i,j;
    char k='a';
for(i=1;i<=5;i++){
    for(int space=4;space>=i;space--){
        System.out.print(" ");
    }
    for(j=1;j<=i;j++){
    System.out.print(k++);
       
}   
    System.out.println("  ");
}    
}
}
