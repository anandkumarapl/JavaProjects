/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.P;

/**
 *
 * @author lenovo
 */
public class Pattern5 {
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=1;i<=n;i++){
            for(j=n;j>=1;j--){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
