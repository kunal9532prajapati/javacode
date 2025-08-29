package Arrayss;

// public class missingElement {
    
//     public static void main(String args[]){
//         int[] arr = {1,2,3,4,5,6};
//         int n = arr.length;
//         int sum = (n+1)*(n+2)/2;
//         int value=0;

//         for (int i= 0; i < n; i++){
//             value+= arr[i];
//         }
//         int num = sum-value;
//         System.out.println("this is the array missing element: "+ num);
    
//     }   
// }
public class missingElement {
    public static void main(String args[]) {
        long[] arr = {1, 2, 3, 5, 6};
        long n = arr.length + 1;               // total numbers should be 6
        long sum = n * (n + 1) / 2;            // expected sum of 1..6
        long arraySum = 0;

        for (long num : arr) {
            arraySum += num;
        }

        long missing = sum - arraySum;
        System.out.println("This is the array missing element: " + missing);
    }
}
