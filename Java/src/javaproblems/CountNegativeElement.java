package javaproblems;
public class CountNegativeElement {
  public static void main(String args[]){
      int arr[]={4,6,-4,-6,-9,-1};
      int n=arr.length;
      int negative = 0;
      for(int i=0;i<=n-1;i++){
          if(arr[i]<0){
              negative++;
          }
      }
      System.out.print(negative);
  }  
}
