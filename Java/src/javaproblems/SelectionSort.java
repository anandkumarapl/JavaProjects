package javaproblems;

import java.util.Arrays;

public class SelectionSort {
    
    public static void main(String args[]) {
        int arr[] = {6, 4, 2, 5, 3, 1,0};
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            int k = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[k] > arr[j]) {
                    k = j;
                }
            }
            int t = arr[k];
            arr[k] = arr[i];
            arr[i] = t;
            System.out.println(Arrays.toString(arr));
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
