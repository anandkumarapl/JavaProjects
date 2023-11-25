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
public class Pattern8 {
    public static void main(String[] args) {
        int i,j,n=5,k=2;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print(k+" ");
                k=k+2;
            }
            System.out.println(" ");
        }
    }
}
