package javap;
public class ShortAnArray {
    public static void main(String args[]){
        int arr[]={0,2 ,1 ,2 ,0};
        int n=arr.length;
        for(int i=1;i<n;i++){
          int k=i;
          for(int j=i+1;j<n;j++){
              if(arr[k]>arr[j]){
                  k=j;
              }
          }
                  int temp=arr[i];
                  arr[i]=arr[k];
                  arr[k]=temp;
              }
          
        
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
    
