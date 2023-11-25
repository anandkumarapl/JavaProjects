
package problems;
public class min {
    public static void main(String args[]){
        int arr[]={7,5,4,9,3,1};
        int min=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
               
            }
             
        }
        System.out.println(min);
    }
}
