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
public class If {
      public static void main(String args[]){
      int pass;
      System.out.println("input password");
      Scanner s=new Scanner(System.in);
      pass=s.nextInt();
      if(pass==1234){
          System.out.println("name : Anand Kumar Pal");
          System.out.println("Age : 23");
         System.out.println("Address : Paigamberpur Sarnath Varanasi");
         System.out.println("Mobile No : 9369419149");
          
      }
      }
}
