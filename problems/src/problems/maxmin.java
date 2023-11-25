
package problems;
public class maxmin {
    public static void main(String args[]){
        int arr[]={9,6,7,8,3,1,2,4};
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            for(i=1;i<=arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            
        }
        System.out.println(max);
        System.out.println(min);
    }
    
}
}
