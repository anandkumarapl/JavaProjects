package javaprograms;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String args[]){
   int reverse=0,n,remender=0;
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   while(n!=0){
       remender=n%10;
       reverse=reverse*10+remender;
       n=n/10;
       
   }
        System.out.println(reverse+" reverse");
    }}
