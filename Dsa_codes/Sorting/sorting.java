package Sorting;

public class sorting {
    public static void main(String[] args) {
        int [] arr = {2,5,2,6,4,7,9,1};
        int n = arr.length;
        for(int ele: arr){
            System.out.print(ele +",");
        }
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        for(int print: arr){
            System.out.print(print+",");
        }
    }
}
