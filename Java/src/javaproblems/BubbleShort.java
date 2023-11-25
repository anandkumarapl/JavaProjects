
package javaproblems;

public class BubbleShort {
   public static void main(String args[]){
       int arr[]={5,3,1,7,8,4};
       int n=arr.length;
    for(int i=0;i<=n-2;i++){
        if(arr[i]>arr[i+1]){
            int k=i;
            for(int j=i+1;j<=n-1;j++){
            if(arr[j]>arr[j-1]){
                k=j;
            }
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            }
        }
   }
   for(int i=0;i<=n-1;i++){
       System.out.println(arr[i]);
   } 
}
}
