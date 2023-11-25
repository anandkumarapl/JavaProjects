
package javaproblems;

public class insertion {
    public static void main(String args[]){
int arr[]={8,9,4,2,6,5};
int n=arr.length;
for(int i=0;i<=n-2;i++){
    if(arr[i]>arr[i+1]){
        
     int j=i+1;
    
    while( j>=1 && arr[j]<arr[j-1]){
       int temp=arr[j-1];
        arr[j-1]=arr[j];
        arr[j]=temp;
        j--;
    }
}
}
for(int i=0;i<=n-1;i++){
    System.out.print(arr[i]);
    }
}
}