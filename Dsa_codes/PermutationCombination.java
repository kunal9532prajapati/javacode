
import java.util.Scanner;


public class PermutationCombination {
    public static int factorial(int x){
        int xfact = 1;
        for (int i = 2; i <= x; i++) {
            xfact *= i;
        }
        return xfact;
    }

    public static int permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and r for permutation and combination:");
        int n = sc.nextInt();
        int r = sc.nextInt();

        try {
            System.out.println("Permutation P(" + n + "," + r + ") = " + permutation(n, r));
            System.out.println("Combination C(" + n + "," + r + ") = " + combination(n, r));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


