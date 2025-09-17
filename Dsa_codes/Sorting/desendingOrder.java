package Sorting;

public class desendingOrder {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 6, 4, 7, 9, 1};
        int n = arr.length;
        
        System.out.print("Original: ");
        for(int ele : arr) {
            System.out.print(ele + ",");
        }
        
        // Bubble sort for descending order
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements
                if(arr[j] < arr[j + 1]) {
                    // Swap if left is smaller (for descending order)
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.print("\nSorted: ");
        for(int print : arr) {
            System.out.print(print + ",");
        }
    }
}