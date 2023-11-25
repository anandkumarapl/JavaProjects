
package problems;
public class daimondpattern {
   public static void main(String args[]){
 int i, space, rows=5, k = 0;
   for (i = 1; i <= rows; ++i, k = 0) {
      for (space = 1; space <= rows - i; ++space) {
         System.out.print("  ");
      }
      while (k != 2 * i - 1) {
         System.out.print("* ");
         ++k;
           
      }
       System.out.println();
}   
   

   }
 
}