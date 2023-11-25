/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        int n,flag=0,m=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       m=n/2;
       if(n==0||n==1){
           System.out.print(n+"Not Prime");
       }
       else{
           for(i=2;i<=m;i++){
               if(n%i==0){
                   System.out.print(n+"Not Prime");
                   flag=1;
                   break;
               }
           }
           if(flag==0){
               System.out.print(n+"Prime");
           }
       }
    }

}