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
public class Pattern7 {
    public static void main(String[] args) {
        int i,j,n=5,k=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print(k+++" ");
                k=k+1;
            }
            System.out.println("");
        }
    }
 
}
