package javaprograms;
public class TwoSum {
public static void main(String args[]){
    int arr[]={1,4,3,2,5};
    int target=6;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target){
                System.out.print(target +"point");
            }
        }
    }
    System.out.println("not");
}    
}
