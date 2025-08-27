package Arrayss;

public class missingElement {
    
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int sum = (n+1)*(n+2)/2;
        int value=0;

        for (int i= 0; i < n; i++){
            value+= arr[i];
        }
        int num = sum-value;
        System.out.println("this is the array missing element: "+ num);
    
    }   
}
