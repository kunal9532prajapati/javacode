package Arrayss;

public class DeepCopyArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1.clone(); // Deep copy using clone() method

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
    }
    
}
