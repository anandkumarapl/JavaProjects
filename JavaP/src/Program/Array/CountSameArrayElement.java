package Program.Array;
public class CountSameArrayElement {
    public static void main(String args[]){
        int arr[]={7,7,9,7,5,7,3,4,4};
        int n=arr.length-1;
        int count=0;
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if(arr[i]==arr[j])
                    System.out.print(arr[j]+" ");
                    j=j+1;
            }
        }
    }
}
