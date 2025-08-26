package Arrayss;

import java.util.Arrays;

public class DeepCopyArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = Arrays.copyOf(arr1, arr1[3]); // Deep copy using clone() method
        int[] arr3 = new int[5];
        
        // Modifying arr2
        arr2[0] = 10;

        // Printing both arrays to show they are independent
        System.out.println("Array 1: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }

        System.out.println("\nArray 2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
       
    
       
        // int[] x = Arrays.copyOf(arr1, arr1.length);
        // x[0] = 99;
        // System.out.println(arr1[0]);
    }
}
