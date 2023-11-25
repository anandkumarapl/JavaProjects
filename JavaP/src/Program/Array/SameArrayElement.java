package Program.Array;

public class SameArrayElement {
    public static void main(String[] args) {
        int arr[] = {1, 1, 4, 2, 2, 2, 2,3};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = true;

            // Check if the current element is a duplicate of any previous element
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = false;
                    break; // Exit the inner loop once a duplicate is found.
                }
            }

            if (!isDuplicate) {
                // If the element is not a duplicate, print it
                System.out.print(arr[i] + " ");
            }
        }
    }
}
