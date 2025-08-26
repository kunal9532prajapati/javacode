package Arrayss;

public class SearchArray {
    
    public static void main(String[] args) {
        int[] arr = {20,34,45,56,45};
        boolean flag = false;
        for (int i=0; i<arr.length; i++){
            
            if(arr[i]==45){//check
                
                flag = true;
                break;// Getting one similer element loop break not search for other.
            } 
        }
        if (flag=true) System.out.print(" Get the element 45");  
        else System.out.println("No Element Found.");
    }   
    
}
    

