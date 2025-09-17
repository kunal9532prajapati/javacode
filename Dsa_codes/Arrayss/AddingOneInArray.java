package Arrayss;

import java.util.ArrayList;
import java.util.Collections;

public class AddingOneInArray {
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        int carry = 1;
        int n= arr.length;

        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i =n-1; i>=0;i-- ){
            int sum= arr[i]+carry;

            if(sum <=9){
                arr1.add(sum);
                carry = 0;
            }
            else{
                arr1.add(0);
                carry = 1;
            }
            
        }
        if (carry == 1) {
            arr1.add(1);  // Add carry at the front
        }
        Collections.reverse(arr1);
        System.out.print(arr1);
    }
    
}
