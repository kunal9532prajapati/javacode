import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for Pascal's Triangle:");
        int n = sc.nextInt();
        printPascalTriangle(n);
    }

    public static void printPascalTriangle(int n) {

        for (int line = 0; line < n; line++) {

            for (int space = 0; space < n - line-1; space++) {
                System.out.print("  "); // Print leading spaces for alignment
            }
            
            int C = 1; // The first value in each line is always 1
            
            for (int i = 0; i <= line; i++) {
                System.out.print(C + "  "); // Print the current value
                C = C * (line - i) / (i + 1); // Calculate the next value using the previous one
            }
            
            System.out.println();
        }
    }

}
