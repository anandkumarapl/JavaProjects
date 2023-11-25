
package javaproblems;

import java.util.Arrays;

public class Part {
  public static void main(String args[]){
      int a[]={-9,3,5,-6,-7,-1};
      int n=a.length-2;
      int left=0,right=n-1;
      while(true){
          while(left<right && a[left]>0){
              left++;
          }
          while(left<right && a[right]<0){
              right++;
              if(left>=right)
                  break;
          }
          int t=a[left];
          a[left]=a[right];
          a[right]=t;
      
      System.out.println(Arrays.toString(a));
  }  
}
}