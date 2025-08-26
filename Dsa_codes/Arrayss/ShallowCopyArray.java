package Array;
import java.util.Arrays;

public class ShallowCopyArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        int[] shallowCopy = originalArray;

        // Modify the original array
        System.out.println("Modify the original array: " + (originalArray[0] = 10));

        // Print both arrays
        
        System.out.println("Shallow Copy: " + Arrays.toString(shallowCopy));
    }
}