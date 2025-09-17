package Sorting;

public class checkSorted {
    public static void main(String[] args) {
        int [] arr = {1,3,4,0,6,6,7,8};
        boolean sorted = true;
        for(int i=0; i<arr.length -1; i++){
            if(arr[i]> arr[i+1]){
                sorted = false;
                break;
            }
        }
        if(sorted) System.out.println("Sorted array");
        else System.out.println("Not Sorted");
    }
    
}
