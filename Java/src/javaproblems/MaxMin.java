package javaproblems;
public class MaxMin {
  public static void main(String args[]){
      int arr[]={1,3,5,7,9,4,10,0};
      int max=arr[0];
      int min=arr[0];
      for(int i=0;i<arr.length-1;i++){
          if(arr[i]>max){
              max=arr[i];
          }
          if(arr[i]<max){
              min=arr[i];
          }
      }
      System.out.println(max+"Max");
      System.out.print(min+"Min");
  }  
}
