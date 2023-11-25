
package problems;
public class max {
    public static void main(String args[]){
        int a[]={3,2,49,45,6};
        
    int max=a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
        System.out.println(max);
}
}
