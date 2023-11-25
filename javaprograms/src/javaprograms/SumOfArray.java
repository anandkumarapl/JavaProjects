package javaprograms;
public class SumOfArray {
    public static void main(String args[]){
        int arr[]={1,3,5,8};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
           sum+=arr[i];
        }
        System.out.print(sum);
    }
}
