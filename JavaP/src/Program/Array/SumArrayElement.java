package Program.Array;
public class SumArrayElement {
    public static void main(String args[]){
        int arr[]={1,2,3,5,6,3};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<=n-1;i++){
            sum+=arr[i];
        }
        System.out.println(sum+" ");
    }
}
