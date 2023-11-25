package program;
public class Array1 {
    public static void main(String args[]){
        int arr[]={2,5,6,2,7,8};
        int n=arr.length;
        for(int j=0;j<=n-1;j++){
             int k=arr[j]; 
             for(int i=0;i<=n-1;i++){
            if(arr[j]<arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        }
 for(int i=0;i<=n-2;i++){
     System.out.println(i);
 }
    }
}
