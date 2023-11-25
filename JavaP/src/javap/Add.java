/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Add {
    public static void main(String args[]){
        int a,b,c;
        System.out.println("enter 2 number");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        System.out.println("Total "+c);
    }
    
}
