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
public class While {
    public static void main(String args[]){
        int num;
        System.out.println("Enter A Number");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        while(num>=0){
            if(num%2==0){
                  System.out.println("even");
            break;
            }
            else{
                  
                  System.out.println("odd");
            break;
            
            }
        
        }
    }
}
