package javaproblems;
public class Array {
    public static void main(String args[]){
      int  A[] = {3, 2, 1, 56, 10000, 167};
      int n=A.length-1;
      int i;
      for(i=0;i<=n;i++){
          if(A[i]>A[i]+1){
            A[i]=A[i]+1;
              System.err.println(A[i]);
          }
      }
    }
}
