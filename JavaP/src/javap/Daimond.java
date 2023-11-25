/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap;
public class Daimond {
    public static void main(String args[]){
        int i,j,space;
        int row=5;
        for(i=0;i<row;i++){
            for(space=row-i;space>=1;space--){
                System.out.print(" ");
            }
            for(j=0;j<i;j++){
                System.out.print("* ");
            }   
              System.out.println("");
        }
      
    }
      
}
