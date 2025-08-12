import java.util.Scanner;

public class SumofNaturalno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();
        
        int sum = 0;
        
        // Loop from 1 to num
        for (int i = 1; i <= num; i++) {
            sum += i; // sum = sum + i
        }
        
        System.out.println("Sum of the first " + num + " natural numbers is: " + sum);
        
        
    }
}

