import java.util.Scanner;

class UserInput{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your Name: ");
        String Name = sc.nextLine();
         
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
       
        System.out.println("your name is: " + Name);

        System.out.println("your age is: " + age);
    }
}
  
