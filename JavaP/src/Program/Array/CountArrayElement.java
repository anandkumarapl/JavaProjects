package Program.Array;
public class CountArrayElement {
    public static void main(String args[]){
        int arr[]={1,4,2,3,5,2};
        int count=0;
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            count=count+1;
            System.out.print(arr[i]+" ");
          
        }
          System.out.println(" ");
        System.out.println("Total  Element"+count+" ");
    }
}
