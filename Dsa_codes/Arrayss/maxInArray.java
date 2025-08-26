package Array;
import java.util.Scanner;
public class maxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array: ");
        for (int i=0; i<n;i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        int max = arr[0];
        for(int i = 1; i<n;i++){
            if(arr[i]>max)
            max = arr[i];
        }
        System.out.println("Maximum element in the array is: " + max);
    }
}
