package javaprograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[])
    {
        int terms,i,a=0,b=1,c;
        Scanner sc=new Scanner(System.in);
        terms=sc.nextInt();
        for(i=1;i<=terms;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
    }