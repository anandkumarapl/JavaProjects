
package javaproblems;
public class QuickShort {
  public static void main(String args[]){
      int arr[]={5,10,15,3,0};
      int n=arr.length;
      int mid =arr[0];
      for(int i=0;i<=n-2;i++){
          if(mid<arr[i+1]){
              int temp=arr[i+1];
              arr[i+1]=arr[i];
              arr[i]=temp;
          }
              
      }
      for(int i=0;i<=n-1;i++){
          System.out.print(arr[i]);
      }
  }  
}
