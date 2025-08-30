package Arrayss;

public class TwoSum_Loop {
    public static void main(String[] args) {
        
        int [] arr = {2,5,5,11};
        boolean found = false;
        int target = 10;
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    found = true;
                    System.out.println( "Index: " +i + " " + "Index: " + j);
                }
            }            
        }
        if(found){
            System.out.println("Target: " + target);                           
        }
    }
}

