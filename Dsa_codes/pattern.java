import java.util.Scanner;

class pattern{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = n; j >= i; j--) {
                if(i%2!=0) {
                    System.out.print(" " +(char)(65 + i - 1)+"  ");
                } else {
                    System.out.print(" " + i + "  ");
                }
                
            }
            System.out.println();
        }
    }

}