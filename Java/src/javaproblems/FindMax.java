package javaproblems;
public class FindMax {
    public static void main(String[] args) {
        int arr[]={9,2,5,6,7,2,3,8};
        int n=arr.length;
        int max=arr[0];
        for(int i=0;i<=n-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(max+" "+"Maximum"+" ");
    }
}
