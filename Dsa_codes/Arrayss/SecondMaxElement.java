package Arrayss;

public class SecondMaxElement {
    public static void main(String[] args) {
        
        int [] arr = {4,53,67,24,56,46};
        
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        //Maximum
        for (int i =0;  i < arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }   

        }
        //Second Maximum
        for (int i =0;  i < arr.length; i++){
            if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }   

        }
        System.out.println(max);   
        System.out.println(smax);    
        
    }
    
}
