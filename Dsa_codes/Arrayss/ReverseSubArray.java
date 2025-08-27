package Arrayss;

public class ReverseSubArray {
      public static void main(String[] args) {
        
        int [] arr = {4,5,7,8,3,2,1};
        int i =2 , j= 5;

        while(i<j){
            //swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int num : arr) System.out.print (num + " ");
    }
}
