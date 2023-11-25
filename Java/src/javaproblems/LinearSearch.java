package javaproblems;

import java.util.Scanner;

public class LinearSearch {
 public static void main(String args[]){
     int arr[]={1,2,3,4,5,6,7,8,9,10};
     int n=arr.length;
             Scanner sc=new Scanner(System.in);
             System.err.println("Enter Number");
             int find=sc.nextInt();
     for(int i=0;i<=n-1;i++){
         if(find==arr[i]){
             System.out.println(arr[i]+" "+"find"+i);
         }
     }
 }
}
