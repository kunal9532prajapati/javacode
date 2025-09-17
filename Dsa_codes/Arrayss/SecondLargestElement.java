package Arrayss;
public class SecondLargestElement {
    public static int value(int[] arr){
        int n = arr.length;
        int large = arr[0];
        int slarge = -1;
        for(int i=0; i<n; i++){
            if(arr[i]>large){
                slarge = large;
                large = arr[i];
            }
            else if(arr[i]>slarge && arr[i]<large){
                
                slarge = arr[i];
            }
        }
        return slarge;
    }
    public static void main(String[] args) {
        int [] arr= {1,4,5,2,6,7,3};
        
        System.out.println(" " +value( arr));

    }
    
}
