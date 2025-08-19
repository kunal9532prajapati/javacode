//package Dsa_codes;
import java.util.Scanner;
public class ToggleString {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        System.out.println("Enter string");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i); 
  //more time taking 
            // if(Character.isUpperCase(ch)){
            //     System.out.print(Character.toLowerCase(ch));
            // } else if(Character.isLowerCase(ch)){
            //     System.out.print(Character.toUpperCase(ch));
            // } else {
            //     System.out.print(ch); // Print non-alphabet characters unchanged
            // }
  // less time taking
            if (ch >= 'a' && ch <= 'z') {
                System.out.print((char)(ch - 32)); // Convert lowercase to uppercase
            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.print((char)(ch + 32)); // Convert uppercase to lowercase
            } else {
                System.out.print(ch); // Print non-alphabet characters unchanged
            } 
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("\nTime taken: " + duration + " milliseconds");
    }

    
}
