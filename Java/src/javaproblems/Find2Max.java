package javaproblems;
public class Find2Max {
    public static void main(String args[]){
        int arr[]={9,2,5,6,7,3,80};
        int n=arr.length;
        int max=arr[0];
        int temp=0;
        for(int i=0;i<=n-1;i++){
     for(int j = i+1; j<n-1; j++){

            if(arr[i]>arr[j]){
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
         }
        }
      System.out.println(arr[n-2]);
   }
}
