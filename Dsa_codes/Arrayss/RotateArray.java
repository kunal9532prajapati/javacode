package Arrayss;

public class RotateArray {
    public static void Reverse(int arr[], int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void Rotate(int arr[], int d){
        int n = arr.length;
        
        if(n==0) return;
        d = d%n;// In case d > n
        
        Reverse(arr, 0, d-1);
        Reverse(arr, d, n-1);
        Reverse(arr, 0, n-1);
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int d = 13;
        Rotate(arr, d);

        System.out.print("Rotated Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
