package Arrayss;

public class WaveArray {
    public static void main(String []args){
        int[] arr = {2,3,5,6,8,11,13,17,23};
        
        for(int i=0; i<arr.length-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int num: arr){
            System.out.print(num + " , ");
        }
        

    }


}
