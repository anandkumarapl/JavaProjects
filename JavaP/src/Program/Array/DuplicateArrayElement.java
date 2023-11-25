package Program.Array;
public class DuplicateArrayElement {
    public static void main(String args[]){
        int arr[]={2,1,3,1,2};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;i++){
                if(arr[i]==arr[j])
                     System.out.print(arr[j]);
                    j=j+1;
               }
        }
    }
}
