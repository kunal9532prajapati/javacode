package Arrayss;

public class Segregate0sAnd1s {
    public static void main(String[] args) {
        int [] arr = {1,0,0,1,1,0,1};
        int numZero = 0;
        for (int i=0; i<arr.length;i++){
            if(arr[i]==0) numZero++;
        }
        for (int i=0; i<numZero;i++){
            arr[i] = 0;

        }
        for (int i=numZero; i<arr.length;i++){
            arr[i] =1;
        }
        for(int arrr : arr){
            System.out.println(arrr);
        }
        
    }
    
}
