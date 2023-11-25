package javaproblems;

import java.util.Arrays;

public class PartitionPositiveAndNegative {
    public static void main(String args[]){
        int a[]={11,-2,3,-4,5,6,-8,-10};
      int n=a.length;
    int left=0,right=n-1;
    while(true)
    {
        while(left<right && a[left]>=0)
            left++;        
         while(left<right && a[right]<0)
            right--;
         if(left>=right)
             break;
         
         int t=a[left];
         a[left]=a[right];
         a[right]=t;
    }
        System.out.println(Arrays.toString(a));
    }
}