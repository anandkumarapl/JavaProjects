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
public class ElseIf {
    public static void main(String args[]){
        int pass;
        System.out.println("Enter Pass");
        Scanner s=new Scanner(System.in);
        pass=s.nextInt();
        if(pass==1)
        {
            System.out.print("K");
        }
         else if(pass==2){
        System.out.println("O");
    }
    else if(pass==3){
        System.out.println("M");
    }
         else if(pass==2){
        System.out.println("A");
    }
         else if(pass==2){
        System.out.println("L");
    }
         else{
             System.out.println("Did not Match");
         }
    }
    
}
