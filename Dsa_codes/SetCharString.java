import java.util.Scanner;

public class SetCharString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: "); //"Hello World"
        String str = sc.nextLine();
      
        StringBuilder sb = new StringBuilder(str);

        // Replace character at index 6 (W) with 'J'
        sb.setCharAt(6, 'J');

        System.out.println(sb); // Output: Hello Jorld
    }
}
