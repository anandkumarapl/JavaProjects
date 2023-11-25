package javaproblems;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]){
        int arr[]={1,2,6,7,9,30,40,70,100};
        int n=arr.length;
       int last=n-1;
       int first=arr[0];
       int mid =n/2;
       int find=30;
         while( first <= last ){  
               if (arr[mid] < find ){  
            first = mid + 1;     
        }else if ( arr[mid] == find ){ 
             System.out.println("index " + mid +" "+"found");  
            break;  
        }else{  
             last = mid - 1;  
        }  
        mid = (first + last)/2;  
         if ( first > last ){  
      System.out.println("Element is not found!");  
   }  
 }
 }
}
