
//    public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter first character:");

//         char a = scanner.next().charAt(0);

//         System.out.println("Enter second character:");

//         char b = scanner.next().charAt(0);
//         int x = a;

//         int y = b;

//         System.out.println("The ASCII value of " + a + " is: " + x);

//         System.out.println("The ASCII value of " + b + " is: " + y);

//         System.out.println("The sum of ASCII values is: " + (x + y));
//         int sum = x + y;
//         int diff = x - y;
//         int product = x * y; 
        
//         System.out.println("The character for the sum of ASCII values is: " + sum);
        
//         System.out.println("The character for the difference of ASCII values is: " + (char)diff);
        
//         System.out.println("The character for the product of ASCII values is: " + (char)product);
        
//         char ab = 'a';
//         int abValue = (int)ab;
//         System.out.println("The ASCII value of 'abc' is: " + abValue)
//     double d = 4/12;
//     int a = 2*(5/2)-4/(4+8);
//     double b = 2*2 - d;
//     System.out.println("The value of a is: " + a);
//     System.out.println("The value of b is: " + b);
//      }
// }

// class Dsa {
//     public static void main(String[] args) {
//         int year = 2020;
//         if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//             System.out.println(year + " is a leap year.");
//         } else {
//             System.out.println(year + " is not a leap year.");
//         }
//     }
// }



// import java.util.Scanner;
// class Demo {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         if(num<0){
//             num =num * (-1);
//         }
//         System.out.println(num);

//     }
// }
// profit or loss calculation

// import java.util.Scanner;
// class Dsa {
//     public static void main(String[] args) {
//         System.out.println("Enter a cost price : ");
//         Scanner sc = new Scanner(System.in);
//         int cp = sc.nextInt();
//         System.out.println("Enter a selling price : ");
//         int sp = sc.nextInt();
//         if (cp<sp){
//             int profit = sp - cp; 
//             System.out.println("Profit : " + profit);
//         } else if (cp>sp){
//            
//             System.out.println("Loss : " + (cp - sp));
//         }
//     }
// }


// class Dsa{
//     public static void main(String[] args) {
//         System.out.println("Enter a three digit nunber: ");
//         Scanner scanner = new Scanner(System.in);
//         int num = scanner.nextInt();
//         if (num > 99 && num < 1000) {
//             System.out.println("the number is three digit number");
//         } else {
//             System.out.println("the number is not a three digit number");
//         }        
//     }
// }

// class Dsa {
//     public static void main (String[]args){
//         System.out.println("Enter first number:");
//         Scanner scanner = new Scanner(System.in);
//         int a = scanner.nextInt();
//         System.out.println("Enter second number:");
//         int b = scanner.nextInt();
//         System.out.println("Enter third number:");
//         int c = scanner.nextInt();
//         if(a>b && a>c) {
//             System.out.println("The largest number is: " + a);
//         } else if(b>a && b>c) {
//             System.out.println("The largest number is: " + b);
//         } else {
//             System.out.println("The largest number is: " + c);
//         }

//     }
    
// } 

// class Dsa {
//     public static void main(String[] args) {
//         System.out.println("Enter a number");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         if (a%5==0 || a%3==0){
//             if(a%15!=0){
//                 System.out.println("The number is divisible by 5 or 3 but not by 15");
//             } else {
//                 System.out.println("The number is divisible by 5, 3 and 15");
//             }
            
//         }
//     }
// }



// class Dsa {
//     public static void main(String[] args) {
//         System.out.println("Enter a number");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         if (a%15!=0 && (a%5==0 || a%3==0) ){
//             System.out.println("The number is divisible by 5 or 3 but not by 15");
//         }else{
//             System.out.println("The number is error");
//         }

        
//     }
// }

// class Dsa{
//     public static void main(String[] args) 
//     {
//         System.out.println("ram Enter your age");

//         Scanner sc = new Scanner(System.in);
//         int ram = sc.nextInt();

//         System.out.println("shyam Enter your age");
//         int shyam = sc.nextInt();

//         System.out.println("mohan Enter your age");
//         int mohan = sc.nextInt();

//         if (ram <shyam && ram<mohan)
//         {
//             System.out.println("ram is the youngest");
//         }
//             else if (shyam<ram && shyam<mohan)
//             {
//                 System.out.println("shyam is the youngest");
//             } 
//         else {
//             System.out.println("mohan is the youngest");
//         }      
                
//     }     
// }
          

     

// class Dsa{
// 	public static void main(String args[]) {
//         for(int i=1; i<=10; i++){
//             System.out.print( + i);//12345678910
//         }
//         System.out.println();

//     }
// }

// ascii value of characters

// class Dsa{
// 	public static void main(String args[]) {
//         for(int i=1; i<=5; i++){
//             if(i%2 == 0) {

//                 for(int j=0; j<i; j++){
               
//                     System.out.print(" "+(char)(65 + j));
//                 }                 // A * B * C * D * E * F *
//             }else {

//                 for(int j=1; j<=i; j++)
//                 System.out.print(j);// A B C D E F
//             }               
//         }
//         System.out.println();   
//     }
// }

// Traingle pattern

// class Dsa{
// 	public static void main(String args[]) {
//         for(int i=0; i<=5; i++){
//             for(int j=0; j<=i; j++){
//                 System.out.print(" * ");
//             }
//             System.out.println( );// Move to the next line after each row
//         }
//     }
// }
//  import java.util.Scanner;
// class Dsa {
//     public static void main(String[] args) {
//         System.out.println("Enter a number");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum=0;

//         while(num>=1){
//             int lastDigit = num%10;
//             if(lastDigit%2==0){
//                 sum += lastDigit;
//             }
//             num/=10;
//         }
//         System.out.println(sum);
//     }
// }
import java.util.Scanner;
class Dsa {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==mid || j==mid)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

// import java.util.Scanner;
// class Dsa {
//     public static void main(String[] args) {
//         System.out.println("Enter a number");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//     }
// }















