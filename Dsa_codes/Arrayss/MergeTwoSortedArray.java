package Arrayss;
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,5,7,9,13,68};
        int[] arr2 = {1,3,4,5,11,23,64,67};

        int[] arr3 = new int[arr1.length + arr2.length];

        for(int elem : arr3){
            System.out.print(elem);
        }
        System.out.println();

        for(int elem : arr3){
            System.out.print(elem);
        }
        System.out.println();

        merge(arr3,arr1,arr2);
        int i=0,j=0,k=0;

    }
    public static void merge(int[]arr3, int[]arr1, int[] arr2){
        int i=0, j=0, k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] <arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }
            else{
                arr3[k] = arr2[j];
                j++;
            }
            k++;

        }
        
        while(j<arr1.length){
            arr3[k] = arr1[i];
            k++;
            i++;
        }
        
        
        while(i<arr2.length){
            arr3[k] = arr2[j];
            k++;
            j++;
        }
        

    }
    
}
